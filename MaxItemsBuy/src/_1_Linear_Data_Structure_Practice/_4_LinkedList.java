package _1_Linear_Data_Structure_Practice;

/*
 * Node represents a SINGLE element of a Linked List.
 * It does NOT know anything about the whole list.
 * It only knows:
 *  - its own data
 *  - whom it points to next
 */
class Node {

    int data;   // actual value stored in this node
    Node next;  // reference to the next node in the list

    /*
     * Constructor:
     * When a node is created, it holds data
     * and by default does NOT point to anyone (next = null)
     */
    Node(int data) {
        this.data = data;
        this.next = null;
    }

    /*
     * toString() is overridden only for debugging / understanding.
     * It helps visualize:
     *  - what data this node has
     *  - which node it is pointing to
     */
    @Override
    public String toString() {
        return "Node : " + data + " pointing to -> " + next;
    }
}

public class _4_LinkedList {

    /*
     * Traverse and print the entire linked list.
     * We NEVER modify head here.
     * We use a temporary pointer to walk through the list.
     */
    public static void printList(Node head) {

        // temp starts from head (entry point of the list)
        Node temp = head;

        // keep moving until we fall off the list (null)
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next; // move to next node
        }

        // end marker of a linked list
        System.out.println("null");
    }

    /*
     * Insert a node at the BEGINNING of the list.
     * This operation CHANGES head, so we MUST return head.
     *
     * Steps:
     * 1. Create a new node
     * 2. Point new node to current head
     * 3. Move head to the new node
     */
    public static Node insertAtHead(Node head, int data) {

        Node newNode = new Node(data); // step 1
        newNode.next = head;           // step 2
        head = newNode;                // step 3

        return head; // new head of the list
    }

    /*
     * Insert a node at the END of the list.
     * Head usually does NOT change, but we still return it
     * for consistency and safety.
     */
    public static Node insertAtEnd(Node head, int data) {

        Node newNode = new Node(data);

        /*
         * If list is empty (head == null),
         * then the new node itself becomes the head.
         */
        if (head == null) {
            return newNode;
        }

        // temp is used to traverse WITHOUT losing head
        Node temp = head;

        // move temp until it reaches the last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // last node now points to new node
        temp.next = newNode;

        // head remains unchanged
        return head;
    }


    /*
     * Finds the middle node of a singly linked list
     * using the Slow–Fast Pointer (Tortoise–Hare) technique.
     *
     * Why this works:
     * - We do NOT know the length of the list
     * - We do NOT count nodes
     * - We do NOT traverse twice
     * - We move only forward
     */
    public static Node findMiddleWithSlowFast(Node head) {

        // slow pointer moves one node at a time
        // fast pointer moves two nodes at a time
        Node slow = head;
        Node fast = head;

        /*
         * Loop runs while:
         * - fast has not reached the end
         * - fast can still jump two steps ahead
         *
         * Each iteration:
         * - slow moves 1 step
         * - fast moves 2 steps
         *
         * When fast reaches the end of the list,
         * slow will be exactly at the middle.
         */
        while (fast != null && fast.next != null) {
            slow = slow.next;       // tortoise step (1 node)
            fast = fast.next.next;  // hare step (2 nodes)
        }

        /*
         * At this point:
         * - fast is at the end (or past it)
         * - slow is at the middle node
         *
         * For even-length lists, this returns
         * the second middle node (standard interview behavior).
         */
        return slow;
    }


    public static void main(String[] args) {

        /*
         * head is the ONLY entry point to the list.
         * If head is null, the list is empty.
         */
        Node head = null;

        // Insert operations
        head = insertAtHead(head, 10); // List: 10
        head = insertAtHead(head, 20); // List: 20 -> 10
        head = insertAtEnd(head, 25);  // List: 20 -> 10 -> 40
        head = insertAtEnd(head, 30);  // List: 20 -> 10 -> 40 -> 30
        head = insertAtEnd(head, 50);  // List: 20 -> 10 -> 40 -> 50

        // Print final list
        System.out.print("Final List: ");
        printList(head);
        System.out.println(findMiddleWithSlowFast(head));
    }
}
