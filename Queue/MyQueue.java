package Queue;

public class MyQueue <T>{
    protected T[] data;
    private static final int DEFAULT_SIZE = 10;
    private int end = 0;
    int size = 0;

    public MyQueue() {
        this(DEFAULT_SIZE);
    }

    public MyQueue(int size) {
        this.data = (T[])new Object[size];
    }

    public boolean isEmpty() {
        if (size == 0) return true;
        return false;
    }

    public boolean isFull() {
        if (size == DEFAULT_SIZE) return true;
        return false;
    }

    public void display() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public boolean add(T val) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full");
        }
        data[end++] = val;
        size++;
        return true;
    }

    public T remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty !!!");
        }
        T removed = data[0];
        for (int i = 1 ; i < end ; i++){
            data[i-1] = data[i];
        }
        end--;
        size--;
        return removed;
    }

    public boolean find(T val){
        for (int i = 0;i < size ; i++){
            if (data[i] == val){
                return true;
            }
        }
        return false;
    }

}
