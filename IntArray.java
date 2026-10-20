import java.util.Arrays;

public class IntArray {

    private int length;
    private int myArray[];

    public IntArray(int l) {
        length = l;
        myArray = new int[length];
    }

    public void clear() {
        myArray = new int[0];
        length = 0;
    }

    public void fillRand() {
        for (int i = 0; i < length; i++) {
            myArray[i] = (int)(Math.random() * 6) + 1;
        }
    }

    public int get(int element) {
        return myArray[element];
    }

    public void set(int element, int newValue) {
        myArray[element] = newValue;
    }

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void sort() {
        Arrays.sort(myArray);
    }

    @Override
    public String toString() {
        return Arrays.toString(myArray);
    }
}