final public class p3 {
    final int x=6;
    final void change(){
        // x=90;
        System.out.println(x);

    }


}
class child extends p3{
 // void change() {
        // System.out.println("I am changing");
    // }
    public static void main(String[] args) {
        p3 obj = new p3();
        obj.change();

    }
}