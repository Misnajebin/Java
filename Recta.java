public class Recta {
    int l, b;

    Recta(int x, int y) {
        l = x;
        b = y;
    }

    void area() {
        System.out.println("Area : " + l * b);
    }
}

class cube extends  Recta {
    int h;
     cube(int x,int y , int z) {
        
        super(x,y);
        h=z;
        System.out.println(h);
     }
     void volume() {
        System.out.println("Volume :" + l*b*h);
     }
    public static void main(String[] args) {
        cube c = new cube(1,2,3);
        c.area();
        c.volume();
    }

}
