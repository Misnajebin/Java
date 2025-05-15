
class Circle {
    int radius;
    Circle(int r){
        radius = r;
    }
    void area(){
        System.out.println("Area of the circle is "+3.14*radius*radius);
    }
    
    public static void main(String args[]){
       Circle obj=new Circle(5);
    //    obj.radius=5;

       obj.area();
    }

}