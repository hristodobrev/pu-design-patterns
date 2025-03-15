package decorator;

public class DecoratorClient {
    public static void main(String[] args) {
        Car lada = new Lada();
        lada = new EngineDecorator(lada, "V6");
        lada = new ColorDecorator(lada, "Blue");
        lada.create();

        Car audi = new Audi();
        audi = new ColorDecorator(audi, "Red");
        audi.create();
    }
}
