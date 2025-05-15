import java.util.Scanner;

interface shape{
    public void area();
    public void perimeter();
}
class circle implements shape{
    double radius;
    circle(int r){
        radius=r;
    }
    public void area(){
        System.out.println("area of circle is "+3.14*radius*radius);
    }
    public void perimeter(){
        System.out.println("perimeter of circle is "+2*3.14*radius);
    }
}
class rectangle implements shape{
    int l;
    int b;
    rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    public void area(){
        System.out.println("area of rectangle "+l*b);
    }
    public void perimeter(){
        System.out.println("perimeter of rectangle "+2*(l+b));
    }
}
public class shapes{
    public static void main(String[] args) {
        circle c=new circle(5);
        rectangle r=new rectangle(2, 4);
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("choose the options:\n1.AREA OF CIRCLE\n2.PERIMETER OF CIRCLE\n3.AREA OF RECTANGLE\n4.PERIMETER OF RECTANGLE\n5.EXIT");
            int ch=sc.nextInt();
            switch (ch) {
                case 1:
                    c.area();
                    break;
                case 2:
                    c.perimeter();
                    break;
                case 3:
                    r.area();
                    break;
                case 4:
                    r.perimeter();
                    break;
                case 5:
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}
