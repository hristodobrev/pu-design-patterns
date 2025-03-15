package adapter;

public class ExternalResource implements ExternalDataResource {
    @Override
    public void loadExternalData(String resource) {
        System.out.println("Loading data from " + resource);
    }
}
