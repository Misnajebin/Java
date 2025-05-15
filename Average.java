import java.util.Scanner;

class negative extends RuntimeException {
    negative(String s) {
        super(s);
    }
}

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n = sc.nextInt();
        int a[] = new int[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            try {
                if (a[i] < 0) {
                    throw new negative("The number is negative");
                }
                else {
                    sum=sum+a[i];
                }
            } catch (negative e) {
                System.out.println(e.getMessage());
                System.exit(0);
            }
        }
        float avg=(float)sum/n;
        System.out.println("The average is " + avg);

    }

}
