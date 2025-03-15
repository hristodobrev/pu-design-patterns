package iterator;

public class NameRepository implements Container<String> {
    private final String[] names = {"Ivan", "Peter", "George"};

    @Override
    public Iterator<String> createIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<String> {
        private int index = 0;
        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public String next() {
            if (this.hasNext())
                return names[index++];

            return null;
        }
    }
}
