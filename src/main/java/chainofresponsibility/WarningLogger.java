package chainofresponsibility;

public class WarningLogger extends Logger {
    public WarningLogger() {
        this.level = 2;
    }

    @Override
    protected void handleMessage(String message) {
        System.out.println("Warning: " + message);
    }
}
