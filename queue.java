import java.util.*;

public class queue {
    public static void main(String[] args) {
        ArrayList<Integer> q = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.add\n2.remove\n3.top\n4.display\n5.Search\n6.exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("enter elmnt to insert:");
                    int s = sc.nextInt();
                    q.add(s);
                    break;
                case 2:
                    System.out.println("elemnt removed:" + q.remove(0));
                    break;
                case 3:
                    System.out.println("peek elemnt is " + q.get(0));
                    break;
                case 4:
                    System.out.println("QUEUE IS:" + q);
                    break;
                case 5:
                    System.out.println("enter elmnt to search:");
                    int sr = sc.nextInt();
                    boolean b = q.contains(sr);
                    if (b) {
                        System.out.println("Element fount at :" + q.indexOf(sr));
                    } else {
                        System.out.println("Not found !!!!");
                    }
                    break;
                case 6:
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}
