package LinkedList;



public class AddTwoNumber extends CustomLinkedList{

    public CustomLinkedList addTwoNumbers(CustomLinkedList l1, CustomLinkedList l2) {
        CustomLinkedList list = new CustomLinkedList();
        int i = 0;
        list.insertLast(l1.getValue(i++)+l2.getValue(i));
        addTwoNumbers(l1,l2);
        return list;
    }

    public static void main(String[] args){
        CustomLinkedList list1 = new CustomLinkedList();
        CustomLinkedList list2 = new CustomLinkedList();

        AddTwoNumber obj = new AddTwoNumber();

        list1.insertLast(2);
        list1.insertLast(4);
        list1.insertLast(3);

        list2.insertLast(5);
        list2.insertLast(6);
        list2.insertLast(4);

        System.out.println(obj.addTwoNumbers(list1,list2));

    }
}
