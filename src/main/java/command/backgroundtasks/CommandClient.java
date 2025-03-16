package command.backgroundtasks;

public class CommandClient {
    public static void main(String[] args) {
        TaskMinder taskMinder = new TaskMinder(500);
        taskMinder.addTask(new BackupTask(), 5000);
        taskMinder.addTask(new DiskStatusTask(), 1000);

        System.out.println(taskMinder);
        taskMinder.start();
    }
}
