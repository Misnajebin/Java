import java.util.Scanner;
class Rectangle {
    int l,b;
    void getval(int x, int y){
        l=x;
        b=y;
    }
    void findarea(){
        System.out.println("Area of Rectangle"+ l*b);
    }
    public static void main(String args[]){
        Rectangle r1 = new Rectangle();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your length and breadth ");
        int l=sc.nextInt();
        int b=sc.nextInt();
        r1.getval(l, b);
        r1.findarea();
    }
}
