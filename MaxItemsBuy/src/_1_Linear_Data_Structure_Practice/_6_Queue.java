package _1_Linear_Data_Structure_Practice;

import java.util.LinkedList;
import java.util.Queue;

public class _6_Queue {
    public static void main(String[] args) {
        // 1. Create the Queue (Using LinkedList as the engine)
        Queue<String> line = new LinkedList<>();

        // 2. Enqueue (Add to the back)
        // .offer() is safer than .add() because it doesn't crash if the queue is full.
        line.offer("Person A");
        line.offer("Person B");
        line.offer("Person C");

        // Queue is now: [Person A, Person B, Person C]

        // 3. Peek (Who is at the front?)
        System.out.println("Next up: " + line.peek());
        // Output: Person A

        // 4. Dequeue (Serve the person!)
        System.out.println("Served: " + line.poll());

        // Queue is now: [Person B, Person C]
        System.out.println("New Front: " + line.peek());
    }
}