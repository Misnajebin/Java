public class Areas {
 
    void area(double r){
        System.out.println("area of circle is "+3.14*r*r);
    }
    void area(int a){
        System.out.println("area of square is "+a*a);
    }
    void area(int l,int b){
        System.out.println("area of Rectangle  is "+l*b);
    }
    void area(double b, int h){
        System.out.println("area of triangle is "+.5*b*h);
    }
    public static void main(String[] args) {
        Areas ar = new Areas();
        ar.area(5);
        ar.area(5.5);
        ar.area(10, 5);
        ar.area(5.5, 8);


    }
}
