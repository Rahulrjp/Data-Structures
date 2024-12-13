package Tree;

import java.util.*;

public class BST {
    private static class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public BST() {

    }

    public boolean isempty() {
        return root == null;
    }

    private int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public int height(){
        return height(root);
    }

    public void insert(int val) {
        if (isempty()) {
            root = new Node(val);
            return;
        }
        insert(root, val);
    }

    private void insert(Node node, int val) {
        if (val < node.value) {
            if (node.left != null) {
                insert(node.left, val);
            } else {
                node.left = new Node(val);
            }
        }
        if (val > node.value) {
            if (node.right != null) {
                insert(node.right, val);
            } else {
                node.right = new Node(val);
            }
        }
        node.height = Math.max(height(node.left),height(node.right)) + 1;
    }

    public void insertArray(int[] arr) {
        if (issorted(arr)) {
            sortedinsertarray(arr);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            this.insert(arr[i]);        //or , insert();
        }
    }

    private void sortedinsertarray(int[] arr) {
        int mid = (arr.length) / 2;
        insert(arr[mid]);
        if (arr.length > 1) {
            sortedinsertarray(Arrays.copyOfRange(arr, 0, mid));
            sortedinsertarray(Arrays.copyOfRange(arr, mid, arr.length));
        }
    }

    private boolean issorted(int[] arr) {
        if (arr.length <= 1 || arr == null) return true;
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
            i++;
        }
        return true;
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

    public void inorderTraverse() {
        inorderTraverse(this.root);
    }

    private void inorderTraverse(Node node) {
        if (node == null) return;
        inorderTraverse(node.left);
        System.out.print(node.value + " ");
        inorderTraverse(node.right);
    }

    public void preorderTraverse() {
        preorderTraverse(this.root);
    }

    private void preorderTraverse(Node node) {
        if (node == null) return;
        System.out.print(node.value + " ");
        preorderTraverse(node.left);
        preorderTraverse(node.right);
    }

    public void postorderTraverse() {
        postorderTraverse(this.root);
    }

    private void postorderTraverse(Node node) {
        if (node == null) return;
        postorderTraverse(node.left);
        postorderTraverse(node.right);
        System.out.print(node.value + " ");
    }

    public boolean find(int val) {
        if (isempty()) return false;
        return find(val, root);
    }

    private boolean find(int val, Node node) {
        if (node == null) return false;
        if (val == node.value) return true;
        if (val < node.value) {
            return find(val, node.left);
        }
        if (val > node.value) {
            return find(val, node.right);
        }
        return false;
    }

    public int findlevel(int val) {
        return findlevel(val, root, 0);
    }

    private int findlevel(int val, Node node, int level) {
        if (node == null) return -1;
        if (val == node.value) return level;
        if (val < node.value) {
            return findlevel(val, node.left, level + 1);
        }
        if (val > node.value) {
            return findlevel(val, node.right, level + 1);
        }
        return -1;
    }

    private Node findNode(int val){
        return findNode(root,val);
    }

    private Node findNode(Node node, int val){
        if (root == null) return null;
        if (val == node.value) return node;
        if (val < node.value) {
            return findNode(node.left,val);
        }
        if (val > node.value) {
            return findNode(node.right,val);
        }
        return null;
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