import java.util.Scanner;

public class cpu {
    static int price;
    class processor{
        int no_cores;
        String manufactor;
        processor(){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter number of cores");
            no_cores=sc.nextInt();
            System.out.println("enter manufactor of processor");
            manufactor=sc.next();
        }
    }
    static class ram{
        int memory;
        String manufactor;
        ram(int memory,String manufactor){
            this.memory=memory;
            this.manufactor=manufactor;
        }
    }
    public static void main(String[] args) {
        cpu ob1=new cpu();
        cpu.processor p1=ob1.new processor();
        cpu.ram r1=new cpu.ram(100, "mamu");
        ob1.price=10;
        r1.memory=10;
        System.out.println(ob1.price);
        System.out.println(p1.no_cores);
        System.out.println(p1.manufactor);
        System.out.println(r1.manufactor);
        System.out.println(r1.memory);
    }
}
