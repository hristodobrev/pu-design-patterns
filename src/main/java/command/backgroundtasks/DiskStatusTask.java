package command.backgroundtasks;

import java.util.Random;

public class DiskStatusTask implements Task {
    String[] statuses = { "Healthy", "Unhealthy", "Inactive", "Dead" };

    @Override
    public void performTask() {
        Random rand = new Random();
        System.out.println(this + statuses[rand.nextInt(statuses.length)]);
    }

    @Override
    public String toString() {
        return "[Disk Status Task]: ";
    }
}
