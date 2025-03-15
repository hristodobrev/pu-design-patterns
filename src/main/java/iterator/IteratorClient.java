package iterator;

public class IteratorClient {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        Iterator iterator = nameRepository.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
