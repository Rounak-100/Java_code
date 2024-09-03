import java.util.Scanner;

class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, ch = 1;
        while (ch > 0) {
            System.out.println("Enter a choice");
            System.out.println("1. Check prime");
            System.out.println("2. Check palindrome");
            System.out.println("3. Print fibonacci");
            System.out.println("4. Check even-odd");
            System.out.println("0. Exit");
            ch = sc.nextInt();
            if (ch == 0)
                break;
            System.out.println("Enter the number");
            n = sc.nextInt();
            switch (ch) {
                case 1: {
                    if (n <= 1)
                        System.out.println("Not prime");
                    else {
                        int c = 0;
                        for (int i = 2; i < n; i++)
                            if (n % i == 0)
                                c++;
                        if (c == 0)
                            System.out.println("Prime");
                        else
                            System.out.println("Not prime");
                    }
                    break;
                }
                case 2: {
                    int temp = n, r = 0, sum = 0;
                    while (n > 0) {
                        r = n % 10;
                        sum = (sum * 10) + r;
                        n = n / 10;
                    }
                    if (temp == sum)
                        System.out.println("Palindrome");
                    else
                        System.out.println("Not Palindrome");
                    break;
                }
                case 3: {
                    int n1 = 0, n2 = 1, n3, i;
                    System.out.println("The 1st n fibonacci series:");
                    System.out.print(n1 + " " + n2);
                    for (i = 2; i < n; i++) {
                        n3 = n1 + n2;
                        System.out.print(" " + n3);
                        n1 = n2;
                        n2 = n3;
                    }
                    break;
                }
                case 4: {
                    if (n % 2 == 0)
                        System.out.println("Even");
                    else
                        System.out.println("Odd");
                    break;
                }
                default:
                    System.out.println("Invalid Input");

            }

        }
    }
}