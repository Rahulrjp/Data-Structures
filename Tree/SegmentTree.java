package Tree;

public class SegmentTree {

    private static class Node{
        private int data;
        private int start;
        private int end;
        private Node left;
        private Node right;

        public Node(int start, int end) {
            this.start = start;
            this.end = end;
        }
        private Node(int data){
            this.data = data;
        }
    }

    private Node root;

    public SegmentTree(int[] arr) {
        this.root = constructTree(arr,0,arr.length-1);
    }

    private Node constructTree(int[] arr, int start, int end) {
        if (start == end){
            Node leaf = new Node(start,end);
            leaf.data = arr[start];
            return leaf;
        }
        Node node = new Node(start,end);
        int mid = (start+end)/2;

        node.left = constructTree(arr,start,mid);
        node.right = constructTree(arr,mid+1,end);

        node.data = node.left.data + node.right.data;
        return node;
    }

    public int query(int qsi,int qei){
        return this.query(this.root,qsi,qei);
    }

    private int query(Node node , int qsi , int qei){
        if (node.start >= qsi && node.end <= qei){
            return node.data;
        }
        else if (node.start > qei || node.end < qsi){
            return 0;
        }
        else {
            return this.query(node.left,qsi,qei) + this.query(node.right,qsi,qei);
        }
    }

//    public void update(int index,int value){
//        if (index >= node.start && index <= node.end){
//            if (index == node.start && index == node.end){
//                node.data = value;
//                return node.data;
//            }
//        }
//    }

}
