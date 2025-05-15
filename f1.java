public class f1 {
    int x,y;
    f1(int a,int b) {
        x=a;
        y=b;
    }
    void display(){
        System.out.println("x="+x+" y="+y);
    }
}
class f2 extends f1{
    int z;
    f2(int a,int b,int c){
        super(a,b);
        z=c;
        System.out.println(z);
    }
    void display(){
        super.display();
        System.out.println("this is child class");
    }
    public static void main(String[] args) {
        f2 obj=new f2(3,4,5);
        obj.display();
    }
}
