package Tree;

import java.util.*;

public class BFS {
    public static void main(String[] args) {
        BST obj = new BST();
        obj.insert(50);
        obj.insert(30);
        obj.insert(70);
        obj.insert(10);
        obj.insert(40);
        obj.insert(60);
        obj.insert(80);
        obj.insert(65);
        obj.insert(81);

        obj.bfsTraversal();

        System.out.println(obj.bfs(11));


    }
}
