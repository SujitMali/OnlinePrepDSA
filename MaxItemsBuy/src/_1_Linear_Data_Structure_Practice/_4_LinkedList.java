package _1_Linear_Data_Structure_Practice;

public class _4_LinkedList {
    public static void main(String[] args)
    {
        Node first = new Node(23) ;
        Node second = new Node(45);
        Node third = new Node(56);

        Node head = first;
        first.next = second;
        second.next = third;
        //Removed first Node by shifting head pointer to second node.
        head = head.next;

        //Temp Pointer to the Head to traverse the Entire list
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

    }
}

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
