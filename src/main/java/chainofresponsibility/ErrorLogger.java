package chainofresponsibility;

public class ErrorLogger extends Logger {
    public ErrorLogger() {
        this.level = 3;
    }

    @Override
    protected void handleMessage(String message) {
        System.out.println("Error: " + message);
    }
}
