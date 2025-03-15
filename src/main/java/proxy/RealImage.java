package proxy;

public class RealImage implements Image {
    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        this.loadImage();
    }

    @Override
    public void render() {
        System.out.println("Image rendered!");
    }

    private void loadImage() {
        System.out.println("Loading image " + fileName);
    }
}
