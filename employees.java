import java.util.Scanner;

public class employees {
    int enumber;
    String ename;
    int esalary;

    employees(int enumber, String ename, int esalary) {
        this.enumber = enumber;
        this.ename = ename;
        this.esalary = esalary;
    }

    void display() {
        System.out.println("DETAILS");
        System.out.println(enumber);
        System.out.println(ename);
        System.out.println(esalary);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of employees");
        int n = sc.nextInt();
        employees a[] = new employees[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the details:");
            System.out.println("employee number:");
            int enumber = sc.nextInt();
            System.out.println("employee name:");
            String ename = sc.next();
            System.out.println("salary");
            int salary = sc.nextInt();
            a[i] = new employees(enumber, ename, salary);
        }
        for (int i = 0; i < n; i++) {
            a[i].display();
        }
        System.out.println("enter the enumber to search:");
        int s = sc.nextInt();
        int f = 0;
        for (int i = 0; i < n; i++) {
            if (a[i].enumber == s) {
                System.out.println("found!!!!!!!!!");
                f = 1;
                a[i].display();
            }
        }
        if (f != 1) {
            System.out.println("not FOUND!!!!");
        }
    }
}
