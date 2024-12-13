package LinkedList;

public class CustomLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public CustomLinkedList() {
        this.size = size;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }


        public Node(Node next, int value) {
            this.value = value;
            this.next = next;
        }

        public Node(){
            this.value = value;
            this.next = next;
        }

        public int getValue(){
            return this.value;
        }

    }


    public void insertfirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }
        size+=1;
    }


    public void insertLast(int val){
        Node node = new Node(val);
        if (tail==null){
            insertfirst(val);
            return;
        }
        tail.next = node;
        tail = node;
        size += 1;
    }


    public void insert(int index , int val){
        if (index == 0) {
            insertfirst(val);
            return;
        }
        if (index == size){
            insertLast(val);
        }

        Node temp = head;

        for (int i = 1; i < index ;i++){
            temp = temp.next;
        }

        Node node = new Node(temp.next,val);

        temp.next = node;

        size++;
    }


    public int size(){
        return size;
    }


    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return value;
    }

    public int getValue(int index){
        Node temp = head;
        for (int i = 0 ; i  < index ; i++){
            temp = temp.next;
        }
        return temp.value;
    }

    private Node getNode(int index){
        Node temp = head;
        for (int i = 0 ; i  < index ; i++){
            temp = temp.next;
        }
        return temp;
    }

    public Node find(int val){
        Node node = head;

        while (node != null){
            if (node.value == val){
                return node;
            }
            else {
                node = node.next;
            }
        }

        return null;
    }


    public int deleteLast(){
        if (size == 1){
            deleteFirst();
        }
        Node node = getNode(size - 2);
        int value = tail.value;
        tail = node;
        tail.next = null;
        size--;
        return value;
    }


    public int delete(int index){
        if (index == 0){
            deleteFirst();
        }
        if (index == size){
            deleteLast();
        }
        Node node = getNode(index);
        Node prevnode = getNode(index-1);
        int value = node.value;
        prevnode.next = node.next;
        node.next=null;
        size--;
        return value;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
