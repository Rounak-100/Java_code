package p2;
import java.util.*;

public class LinkedList {
    public class Node {
        public int data;
        public Node next;
        public Node() {}
        public Node(int d) {
            data = d; next = null;
        }
    }
    Node pointer;
    public void create() {
        Node head = new Node();
        Scanner sc = new Scanner(System.in);
        int n = 1;
        Node ptr = new Node(-1);
        head = ptr;
        while(n == 1) {
            System.out.print("\nEnter Value : ");
            int val = sc.nextInt();
            Node temp = new Node(val);
            ptr.next = temp;
            ptr = ptr.next;
            System.out.print("\nPress 1 to continue : ");
            n = sc.nextInt();
        }
        ptr.next = null;
        head = head.next;
        pointer = head;
    }
    public void display() {
        Node node = pointer;
        System.out.print("Node is :  ");
        while(node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.print("\n");
    }
    public int search(int key) {
        int i = 1;
        Node node = pointer;
        while(node != null) {
            if(node.data == key) {
                return i;
            }
            node = node.next;
            i++;
        }
        return -1;
    }
}