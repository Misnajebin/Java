// 11.Create a class Employee with members employee_id,name,salary,address
//  ,create constructors to initialize the data members ,
//  create another class Teacher that inherit the prpty of
//   class Employee and contains its own data members dept,
//   subject taught,teachername and constructors to initialize 
//   this data members and include a display method to
//    display all the data members.Use array of objects to display
//     details of n teachers.

import java.util.Scanner;

 class Employee {
    int eid;
    String name;
    int salary;
    String address;

    Employee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee id :");
        eid = sc.nextInt();
        System.out.println("Enter the employee Name :");
        name = sc.next();
        System.out.println("Enter the employee salary :");
        salary = sc.nextInt();
        System.out.println("Enter the employee address :");
        address = sc.next();
    }
    
}

class Teacher extends Employee {
    String dept, subject, tname;

    Teacher() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dept :");
        dept = sc.next();
        System.out.println("Enter the subject:");
        subject = sc.next();
        System.out.println("Enter the tname:");
        tname = sc.next();
    }

    void display() {
        System.out.println(
                eid + "\n" + name + "\n" + salary + "\n" + address + "\n" + dept + "\n" + subject + "\n" + tname);
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number of teacher:");
       int n=sc.nextInt();
       Teacher t[]=new Teacher[n];
       for(int i=0;i<n;i++){
        t[i]=new Teacher();
       }
       for(int i=0;i<n;i++){
        System.out.println("Details of employee "+(i+1));
        t[i].display();
       }
    }
}
