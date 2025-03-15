package proxy;

public class ProxyClient {
    public static void main(String[] args) {
        ProxyImage image = new ProxyImage("image.png", true);
        image.render();

        ProxyImage image2 = new ProxyImage("image2.png", false);
        image2.render();
    }
}
