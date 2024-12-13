package Queue;

public class CircularQueue <T> {
    protected T[] data;
    private static final int DEFAULT_SIZE = 10;
    private int front = 0;
    private int end = 0;
    int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
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
        for (int i = front; i < end; i++) {
            System.out.print(data[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public boolean add(T val){
        if (isFull()){
            return false;
        }
        data[end] = val;
        end++;
        size++;
        return true;
    }

    public T remove() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is Empty");
        }
        T remove = data[front];
        front++;
        size--;
        return remove;
    }

}
