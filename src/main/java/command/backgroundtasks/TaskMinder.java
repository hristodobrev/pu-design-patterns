package command.backgroundtasks;

import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings({"BusyWait", "InfiniteLoopStatement"})
public class TaskMinder extends Thread {
    private final long sleepInterval;
    private final ArrayList<TaskEntry> tasks;

    public TaskMinder(long sleepInterval) {
        this.sleepInterval = sleepInterval;
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task, int repeatInterval) {
        repeatInterval = Math.max(repeatInterval, 0);
        TaskEntry entry = new TaskEntry(repeatInterval, task);
        tasks.add(entry);
    }

    public Iterator<TaskEntry> getTasks() {
        return tasks.iterator();
    }

    public void run() {
        while (true) try {
            sleep(sleepInterval);
            long now = System.currentTimeMillis();
            var iterator = getTasks();
            while (iterator.hasNext()) {
                TaskEntry entry = iterator.next();
                if (entry.getRepeatInterval() + entry.getTimeLastDone() <= now) {
                    entry.getTask().performTask();
                    entry.setTimeLastDone(now);
                }
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    @Override
    public String toString() {
        var iterator = getTasks();
        StringBuilder sb = new StringBuilder();
        while (iterator.hasNext()) {
            sb.append(iterator.next().toString()).append("\n");
        }
        return sb.toString();
    }
}
