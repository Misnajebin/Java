import java.util.*;

public class sets {
    public static void main(String[] args) {
        Set <Integer> s=new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.add\n2.remove\n3.search\n4.display\n5.exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("enter the element to insert:");
                    int el=sc.nextInt();
                    s.add(el);
                    break;
                case 2:
                    System.out.println("enter element ot remove:");
                    int de=sc.nextInt();
                    s.remove(de);
                    break;
                case 3:
                   System.out.println("enter elemnt to search:");
                   int e=sc.nextInt();
                   boolean a=s.contains(e);
                   if (a){
                        System.out.println("foundddd");
                    }
                    else{
                        System.out.println("not founded");
                    }
                    break;
                case 4:
                   System.out.println(s);
                   break;
                case 5:
                    System.exit(0);
                default:
                    break;
            }
    }
}}
