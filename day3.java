import java.util.*;

class Complex {
    float real, img;

    public Complex() {}
    public Complex(float x, float y) {
        this.real = x;
        this.img = y;
    }

    public void display() {
        if (img > 0) {
            System.out.println("Complex Number is : " + real + "+" + img + "i");
        } else if (img < 0) {
            System.out.println("Complex Number is : " + real + img + "i");
        } else {
            System.out.println("Complex Number is : " + real);
        }
    }

    public static Complex addition(Complex cm1, Complex cm2) {
        Complex n = new Complex(0, 0);
        n.real = cm1.real + cm2.real;
        n.img = cm1.img + cm2.img;
        return n;
    }

    public static Complex product(Complex c1, Complex c2) {
        Complex n = new Complex(0, 0);
        n.real = c1.real * c2.real - c1.img * c2.img;
        n.img = c1.real * c2.img + c1.img * c2.real;
        return n;
    }
}

public class day3 {
    public static void main(String[] args) {
        Complex c1 = new Complex(4, -5);
        c1.display();
        Complex c2 = new Complex(2, 3);
        c2.display();
        Complex res1 = Complex.addition(c1, c2);
        Complex res2 = Complex.product(c1, c2);
        System.out.println("The sum is : ");
        res1.display();
        System.out.println("The product is : ");
        res2.display();
        // c1.display();
    }
}