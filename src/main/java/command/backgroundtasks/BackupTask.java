package command.backgroundtasks;

public class BackupTask implements Task {
    @Override
    public void performTask() {
        System.out.println(this + "Backup created.");
    }

    @Override
    public String toString() {
        return "[Backup Task]: ";
    }
}
