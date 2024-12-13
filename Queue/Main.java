package Queue;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        MyQueue<String> Que = new MyQueue<>();

        Que.add("First");
        Que.add("Second");
        Que.add("Third");
        Que.add("Fourth");
        Que.add("Fifth");
        Que.add("Sixth");
        Que.display();
        System.out.println(Que.remove());
        Que.add("Seventh");
        System.out.println(Que.size);
        Que.display();
        System.out.println(Que.find("Fifth"));
    }
}
