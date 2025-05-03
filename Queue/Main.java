import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("Jhon");
        queue.offer("Alice");
        queue.offer("Bob");

        System.out.println(queue.poll());

        System.out.println(queue.peek());

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }


        Queue<Integer> numbersQueue = new PriorityQueue<>(Collections.reverseOrder());

        numbersQueue.offer(60);
        numbersQueue.offer(10);
        numbersQueue.offer(35);
        numbersQueue.offer(2);

        while (!numbersQueue.isEmpty()) {
            System.out.println(numbersQueue.poll());
        }
    }
}
