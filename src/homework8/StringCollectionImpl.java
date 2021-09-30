package homework8;

import java.util.Arrays;

public class StringCollectionImpl implements StringCollection {
    private String[] arr = new String[10];
    int size = 0;

    @Override
    public String get(int index) {
        try {
            return arr[index];
        } catch (NullPointerException e) {
            return null;
        }
    }

    @Override
    public boolean add(String str) {
        if (size == arr.length) {
            arr = Arrays.copyOf(arr, arr.length + arr.length / 2);
            arr[size] = str;
            size++;
            return true;
        } else {
            arr[size] = str;
            size++;
            return true;
        }

    }
    public boolean add(String[] str){
        for (String s : str) {
            arr[size] = s;
            if (arr[size] != null) size++;
        }
        return true;
    }

    @Override
    public boolean add(int index, String str) {
        if(index > size) return false;
        String[] tmp = Arrays.copyOfRange(arr,index,arr.length);
        size -= size-index;
        if(size + index + 1 == arr.length) arr = Arrays.copyOf(arr,arr.length+1);
        arr[index] = str;
        size++;
        return this.add(tmp);
    }

    @Override
    public boolean delete(String str) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(str)) {
                arr[i] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean contains(String str) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(StringCollection collection) {
        return (this.toString().equals(collection.toString()));
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

    @Override
    public String toString() {
        return "StringCollectionImpl{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }
}
