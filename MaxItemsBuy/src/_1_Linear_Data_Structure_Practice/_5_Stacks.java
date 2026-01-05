package _1_Linear_Data_Structure_Practice;

import java.util.Stack;

public class _5_Stacks {
    public static void main(String[] args) {
        // 1. Create the Stack (Think of it as an empty tube)
        Stack<String> history = new Stack<>();

        // 2. Push (Add actions)
        history.push("Typed 'Hello'");
        history.push("Typed 'World'");
        history.push("Deleted 'World'"); // <--- This is at the TOP now
        System.out.println("Initial Stack : " + history);

        // 3. Peek (What was the last thing I did?)
        System.out.println("Last Action: " + history.peek());

        // 4. Pop (Undo! Remove the top)
        System.out.println("Undoing: " + history.pop());

        // Now 'Typed World' is at the top again.
        System.out.println("New Top: " + history.peek());

    }
}
