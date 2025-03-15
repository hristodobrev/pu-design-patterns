package chainofresponsibility;

public class ChainOfResponsibilityClient {
    public static void main(String[] args) {
        ErrorLogger errorLogger = new ErrorLogger();
        WarningLogger warningLogger = new WarningLogger();
        InfoLogger infoLogger = new InfoLogger();

        errorLogger.setNextLogger(warningLogger);
        warningLogger.setNextLogger(infoLogger);

        errorLogger.logMessage(2, "Test");
        errorLogger.logMessage(1, "Test");
        errorLogger.logMessage(3, "Test");
    }
}
