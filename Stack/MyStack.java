package Stack;

public class MyStack {
    protected int[] data;
    private int ptr = -1;
    private static final int DEFAULT_SIZE = 10;
    int size;

    public MyStack() {
        this(DEFAULT_SIZE);
    }

    public MyStack(int size) {
        this.data = new int[size];
    }

    public boolean isEmpty(){
        if (size == 0) return true;
        return false;
    }


    public boolean isFull(){
        if (size == DEFAULT_SIZE) return true;
        return false;
    }

    public void push(int val){
        if (isFull()){
            System.out.println("Stack is full !!!");
            return;
        }
        ptr++;
        data[ptr] = val;
        size++;
    }

    public int pop() throws MyException{
        if (isEmpty()){
            throw new MyException("Stack is empty");
        }
        ptr--;
        size--;
        return data[ptr+1];
    }

    public void display(){
        System.out.print("[");
        for (int i = 0 ; i <  size;i++){
            System.out.print(data[i]);
            if (i < size-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public int top() throws MyException{
        if (isEmpty()){
            throw new MyException("Stack is Empty !!!");
        }
        return data[ptr];
    }

}
