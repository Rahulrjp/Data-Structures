package LinkedList;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    int size;

    public CircularLinkedList() {
    }

    private static class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public void insert(int val){
        Node node = new Node(val);
        if (head == null){
            head = node;
            node.next = node;
            if (tail == null){
                tail = head;
            }
            size++;
            return;
        }
        node.next = head;
        tail.next = node;
        tail = node;
        size+=1;
    }

    public void display(){
        Node node = head;
        do {
            System.out.print(node.value + " -> ");
            node = node.next;
        }while (node != head);
        System.out.println();
    }

    public int size(){
        return size;
    }

    public void delete(){
        Node temp = head;
        for (int i = 1;i < size-1;i++ ){
            temp = temp.next;
        }
        tail = temp;
        temp.next = head;
        size--;
    }
}
