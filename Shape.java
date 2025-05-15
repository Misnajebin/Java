public class Shape {
    int radius,length,breadth;
    Shape(int r){
        radius=r;
    }
    Shape(int l,int b){
        length=l;
        breadth=b;
    }
    void Carea(){
        System.out.println("Area of circle "+3.14*radius*radius);
    }
    void Rarea(){
        System.out.println("Area of rectangle "+length*breadth);
    }
    public static void main(String[] args) {
        Shape circle=new Shape(5);
        circle.Carea();
        Shape rectangle=new Shape(4, 6);
        rectangle.Rarea();
    }
}
