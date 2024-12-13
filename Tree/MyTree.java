package Tree;

import java.util.*;

public class MyTree {
    private Node root;

    public MyTree() {

    }

    private class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }


        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    public void insertroot(Scanner sc) {
        System.out.println("Enter the root node : ");
        int value = sc.nextInt();
        root = new Node(value);
        insertnode(sc, root);
    }

    private void insertnode(Scanner sc, Node node) {
        System.out.println("insert left of " + node.value + " ?");
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the left of " + node.value);
            int val = sc.nextInt();
            node.left = new Node(val);
            insertnode(sc, node.left);
        }
        System.out.println("Insert right of " + node.value + " ?");
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter right of " + node.value);
            int val = sc.nextInt();
            node.right = new Node(val);
            insertnode(sc, node.right);
        }
    }

    public void display() {
        display(this.root, 0);
    }

    private void display(Node node, int level) {
        if (node == null) return;
        display(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>" + node.value);
        } else {
            System.out.println(node.value);
        }
        display(node.left, level + 1);
    }
    public void bfsTraversal(){
        if (root == null) return;
        bfsTraversal(root);
    }

    private void bfsTraversal(Node node){

        Queue<Node> Q = new LinkedList<>();

        Q.offer(node);
        System.out.print("[ ");
        while (!Q.isEmpty()){
            if (node.left != null){
                Q.offer(node.left);
            }
            if (node.right != null){
                Q.offer(node.right);
            }
            System.out.print(Q.remove().value + " ");
            node = Q.peek();
        }
        System.out.print("]");
    }
    public void dfsTraversal(){
        if (root == null) return;
        dfsTraversal(root);
    }

    private void dfsTraversal(Node node) {
        if (node == null) return;
        Stack<Node> st = new Stack<>();
        st.push(node);
        while (!st.isEmpty()){
            System.out.print(st.pop().value + " ");
            if (node.right != null) st.push(node.right);
            if (node.left != null)  st.push(node.left);
            if (!st.isEmpty()) node = st.peek();
        }
        System.out.println();
    }

    public boolean bfs(int val){
        if (root == null) return false;
        return bfs(root,val);
    }

    private boolean bfs(Node node,int val) {
        if (node.value == val) {
            return true;
        }
        Queue<Node> Q = new LinkedList<>();

        Q.offer(node);
        while (!Q.isEmpty()){
            if (node.left != null){
                Q.offer(node.left);
            }
            if (node.right != null){
                Q.offer(node.right);
            }
            if (Q.remove().value == val){
                return true;
            }
            node = Q.peek();
        }
        return false;
    }
    public boolean dfs(int val){
        if (root == null) return false;
        return dfs(root,val);
    }
    private  boolean dfs(Node node,int val){
        if (node.value == val) return true;
        Stack<Node> st = new Stack<>();
        st.push(node);
        while (!st.isEmpty()){
            if (st.pop().value == val) return true;
            if (node.right != null) st.push(node.right);
            if (node.left != null)  st.push(node.left);
            if (!st.isEmpty()) node = st.peek();
        }
        return false;
    }


}
