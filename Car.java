public class Car {
    static  String brand = "Suzuki";
    int price;
    String model;

    Car(int p, String m) {
        price = p;
        model = m;
    }

    void display() {
        System.out.println(price);
        System.out.println(brand);
        // System.out.println(brand);
        System.out.println(model);

    }

    public static void main(String[] args) {
        // Car c = new Car(10000, "swift");
        // c.display();
        // Car c2 = new Car(200, "bolero");
        // c2.display();
        System.out.println(Car.brand);
        

    }
}
