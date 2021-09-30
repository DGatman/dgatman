package homework8;

public class StringCollectionImpl implements StringCollection{
    private String[] arr = new String[0];
    int size = 0;

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public boolean add(String str) {
        return false;
    }

    @Override
    public boolean add(int index, String str) {
        return false;
    }

    @Override
    public boolean delete(String str) {
        return false;
    }

    @Override
    public boolean contains(String str) {
        return false;
    }

    @Override
    public boolean equals(StringCollection collection) {
        return false;
    }

    @Override
    public boolean clear() {
        this.arr = new String[0];
        this.size = 0;
        return true;
    }

    @Override
    public int size() {
        return this.size;
    }
}
