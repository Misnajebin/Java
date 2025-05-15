public class Animal {
    String color="Greeen";
}
class animal2 extends Animal{

    String color="blue";
    void colordisplay(){
        System.out.println(color);
        System.out.println("Parent class color="+super.color);
    }
    public static void main(String[] args) {
        animal2 ob=new animal2();
        ob.colordisplay();
    }
}
