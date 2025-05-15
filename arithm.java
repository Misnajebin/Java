import java.util.Scanner;

public class arithm{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();

        try{
            System.out.println(a/b);
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
        // System.out.println(c);
    }
}
