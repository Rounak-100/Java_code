package pack2;
import java.util.Scanner;

public class Array {
    private int size;
    private int arr[];
    public Array(int n) {
        size = n;
        arr = new int[size];
    }
    public void create() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + size + " Elements : ");
        for(int i = 0; i < size; i++) {
            int val = sc.nextInt();
            arr[i] = val;
        }
    }
    public void display() {
        System.out.print("Array =  ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public int search(int key) {
        for(int i = 0; i < size; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
