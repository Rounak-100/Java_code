import java.util.*;

class Student {
    String name;
    int roll;
    String dept;
    float avg_marks;
    Student list[];
    int i = -1, size;

    Student(int n) {
        size = n;
        list = new Student[size];
    }

    Student(String name, String dept, int roll, float avg_marks) {
        this.name = name;
        this.dept = dept;
        this.roll = roll;
        this.avg_marks = avg_marks;
    }

    void insert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:");
        String n1 = sc.nextLine();
        System.out.println("Dept:");
        String d = sc.nextLine();
        System.out.println("Roll:");
        int r = sc.nextInt();
        System.out.println("Avg_marks:");
        float a = sc.nextFloat();
        list[++i] = new Student(n1, d, r, a);
    }

    void show() {
        System.out.println(name + " " + dept + " " + roll + " " + avg_marks);
    }

    void display() {
        if (i == -1) {
            System.out.println("Empty list");
        } else {
            for (int j = 0; j <=i; j++) {
                list[j].show();
            }
        }
    }
}

class CSE extends Student {
    CSE(int n) {
        super(n);
    }
}

class ECE extends Student {
    ECE(int n) {
        super(n);
    }
}

class IT extends Student {
    IT(int n) {
        super(n);
    }
}

public class day4{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of list");
        n = sc.nextInt();
        Student ref;
        CSE c1 = new CSE(n);
        ECE c2 = new ECE(n);
        IT c3 = new IT(n);
        int ch1 = 1, ch2;
        do {
            System.out.println("Enter your choice:  1. CSE Department , 2. ECE Department , 3. IT Department ");
            ch2 = sc.nextInt();
            if (ch2 == 1) {
                ref = c1;
            } else if (ch2 == 2) {
                ref = c2;
            } else if (ch2 == 3) {
                ref = c3;
            } else {
                System.out.println("Invalid select");
                continue;
            }
            System.out.println("Enter your choice: 1.Insert, 2.Display, 3.Exit");
            ch1 = sc.nextInt();
            switch (ch1) {
                case 1 -> ref.insert();
                case 2 -> ref.display();
                default -> System.out.println("Wrong selection");
            }
        } while (ch1 != 0);
}
}