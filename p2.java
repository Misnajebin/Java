class p1 {
    p1() {
        System.out.println("This is constructor of base class");
    }

    void display() {
        System.out.println("this is base");
    }
}

class p2 extends p1 {

    p2() {
        System.out.println("This is constructor of parent class");
    }

    int m;

    void display(int x) {
        // int m;
        m = x;
        System.out.println(m);
    }

    public static void main(String[] args) {
        p2 obj = new p2();
        obj.display();
        obj.display(7);
    }
}
