package patterns.behavior;

public class NameRepository implements Container{
    private String mNames[] = {"Robert", "Jhon", "Michael"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < mNames.length) {
                return true;
            }
            return false;
        }
        @Override
        public Object next() {
            if (this.hasNext()) {
                return mNames[index++];
            }
            return null;
        }
    }
}
