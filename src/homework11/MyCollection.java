package homework11;

public class MyCollection implements StringCollection{
    private String[] strings = new String[0];

    @Override
    public String get(int index) {
        try {
            return strings[index];
        }catch (NullPointerException e){
            return null;
        }
    }

    @Override
    public boolean add(String str) {
        return true;
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
        strings = new String[0];
        return true;
    }

    @Override
    public int size() {
        return strings.length;
    }

    public static void main(String[] args) {
        MyCollection col = new MyCollection();
        col.add("one");
        col.add("two");
        System.out.println(col.size());
    }
}
