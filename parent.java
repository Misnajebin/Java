public class parent {
    parent() {
        System.out.println("The Parent Classs !!!");
    }
}
class child extends parent{
    child(){
        System.out.println("The Child Classs !!!");
    }
    public static void main(String[] args) {
        child c = new child();
    }
}


