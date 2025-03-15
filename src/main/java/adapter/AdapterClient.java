package adapter;

public class AdapterClient {
    public static void main(String[] args) {
        ExternalDataResource externalResource = new ExternalResource();
        DataAdapter dataAdapter = new DataAdapter(externalResource);

        dataAdapter.loadData("resource.dat");
    }
}
