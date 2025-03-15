package decorator;

public class Audi implements Car {

    @Override
    public void create() {
        System.out.println("Basic Audi model created!");
    }
}
