package chainofresponsibility;

public abstract class Logger {
    protected int level;
    protected Logger nextLogger;

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (level >= this.level) {
            this.handleMessage(message);
            return;
        }

        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
            return;
        }

        System.out.println("Action could not be performed.");
    }

    protected abstract void handleMessage(String message);
}
