public class MyArray {
    private int[] arr;
    private int buffer;
    private int size;

    public MyArray() {
        this(3);
    }

    public MyArray(int buffer) {
        this.buffer = buffer;
        arr = new int[buffer];
    }

    private void increaseBuffer() {
        buffer = buffer * 2;
        int[] arr2 = new int[buffer];

        int i = 0;
        for (int elem : arr) { // foreach
            arr2[i++] = elem;
        }

        arr = arr2;

    }

    public void add(int element) {
        if (size == buffer) {
            increaseBuffer();
        }
        arr[size++] = element;
    }

    public int get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("index is out of bounds");
        }
        return arr[index];
    }
}
