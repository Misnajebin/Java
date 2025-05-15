import java.util.Scanner;

public class overload {
    void area(int s) {
        System.out.println("Area of square=" + s * s);
    }

    void area(int b, int l) {
        System.out.println("Area of rectangle=" + b * l);
    }

    void area(double b, double h) {
        System.out.println("Area of triangle=" + .5 * b * h);
    }

    void area(double r) {

        System.out.println("Area of circle=" + 3.14*r*r);
    }
    public static void main(String[] args) {
        overload o=new overload();
        o.area(5);
        o.area(5, 2);
        o.area(4.7);
        o.area(9.0, 4.0);

    }
}