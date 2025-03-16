package command.backgroundtasks;

import java.util.Date;

public class TaskEntry {
    private final long repeatInterval;
    private long timeLastDone;
    private final Task task;

    public TaskEntry(long repeatInterval, Task task) {
        this.repeatInterval = repeatInterval;
        this.timeLastDone = System.currentTimeMillis();
        this.task = task;
    }

    public long getRepeatInterval() {
        return repeatInterval;
    }

    public long getTimeLastDone() {
        return timeLastDone;
    }

    public void setTimeLastDone(long timeLastDone) {
        this.timeLastDone = timeLastDone;
    }

    public Task getTask() {
        return task;
    }

    @Override
    public String toString() {
        return task + " executed each " + repeatInterval / 1000 + " seconds. Last executed " + new Date(timeLastDone) + ".";
    }
}
