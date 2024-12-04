import java.util.*;
public class DoublyLinkedList1
{
    Node head;
    class Node
    {
        int data;
        Node prev;
        Node next;
        Node(int data)
        {
            this.data=data;
            prev=null;
            next=null;
        }
    }
   public void insert_at_end(int num) {
        Node newNode = new Node(num);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }
    public void display() 
    {
        Node temp = head;
        while (temp != null) 
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        DoublyLinkedList1 dll = new DoublyLinkedList1();
        
        System.out.println("Enter the items to insert:");
        while (true) 
        {
            int num = s.nextInt();
            if (num == -1) 
            {
                break;
            }
            dll.insert_at_end(num); 
        }
        System.out.println("Enter the element to insert at end: ");
        int n=s.nextInt();
        dll.insert_at_end(n);
        dll.display();
    }
}