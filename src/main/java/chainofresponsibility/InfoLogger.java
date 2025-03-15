package chainofresponsibility;

public class InfoLogger extends Logger {
    public InfoLogger() {
        this.level = 1;
    }

    @Override
    protected void handleMessage(String message) {
        System.out.println("Log: " + message);
    }
}
