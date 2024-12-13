package Stack;



public class Main {
    public static void main(String[] args) throws MyException {
        MyStack stack = new MyStack();

        stack.push(45);
        stack.push(63);
        stack.push(12);
        stack.push(78);
        stack.push(55);
        stack.push(100);
        stack.display();
        System.out.println("size : " + stack.size);
        System.out.println("top element : " + stack.top());
        System.out.println("Popped element : " + stack.pop());
        stack.display();
        System.out.println(stack.isEmpty());
    }
}
