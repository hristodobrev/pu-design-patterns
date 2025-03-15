package iterator;

public interface Container<T> {
    Iterator<T> createIterator();
}
