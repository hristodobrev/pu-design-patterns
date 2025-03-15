package adapter;

public class DataAdapter implements DataProvider {
    private final ExternalDataResource externalResource;

    public DataAdapter(ExternalDataResource externalResource) {
        this.externalResource = externalResource;
    }

    @Override
    public void loadData(String source) {
        this.externalResource.loadExternalData(source);
    }
}
