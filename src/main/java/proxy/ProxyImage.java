package proxy;

public class ProxyImage implements Image {
    private RealImage realImage;
    private final String fileName;
    private final boolean loggedIn;

    public ProxyImage(String fileName, boolean loggedIn) {
        super();
        this.fileName = fileName;
        this.loggedIn = loggedIn;
    }

    @Override
    public void render() {
        if (!this.loggedIn) {
            System.out.println("User is not logged in!");
            return;
        }

        if (this.realImage == null) {
            this.realImage = new RealImage(this.fileName);
        }

        this.realImage.render();
    }
}
