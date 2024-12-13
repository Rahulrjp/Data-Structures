package Tree;

import java.util.*;

public class AVL {
    private Node root;

    public AVL() {

    }

    private class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insert(int val) {
        root = insert(root, val);
    }

    private Node insert(Node node, int val) {
        if (node == null) {
            node = new Node(val);
            return node;
        }
        if (val < node.value) {
            node.left = insert(node.left, val);
        }

        if (val > node.value) {
            node.right = insert(node.right, val);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return rotate(node);
    }


    private Node rotate(Node node) {
        if (height(node.left) - height(node.right) > 1) {
            //left heavy
            if (height(node.left.left) - height(node.left.right) > 0) {
                //left-left case
                return rightRotate(node);
            }
            if (height(node.left.left) - height(node.left.right) < 0) {
                //left-right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if (height(node.left) - height(node.right) < -1) {
            //left heavy
            if (height(node.right.left) - height(node.right.right) < 0) {
                //left-left case
                return leftRotate(node);
            }
            if (height(node.right.left) - height(node.right.right) > 0) {
                //left-right case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    private Node leftRotate(Node node) {
        Node temp = node.right;
        Node temp2 = temp.left;

        //right rotation

        temp.left = node;
        node.right = temp2;

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        temp.height = Math.max(height(temp.left), height(temp.right)) + 1;

        return temp;
    }

    private Node rightRotate(Node node) {
        Node temp = node.left;
        Node temp2 = temp.right;

        //left rotation

        temp.right = node;
        node.left = temp2;

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        temp.height = Math.max(height(temp.left), height(temp.right)) + 1;

        return temp;
    }


    private int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public int height() {
        return height(root);
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
            System.out.println("|~~~~~~>" + node.value);
        } else {
            System.out.println(node.value);
        }
        display(node.left, level + 1);
    }

    public boolean ismpty(){
        return root==null;
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (root == null) return true;
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
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
