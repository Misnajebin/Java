import java.util.Scanner;

class negative extends RuntimeException {
    negative(String s){
        super(s);
    }
}

public class exp {
    int a[] = new int[4];
    Scanner s = new Scanner(System.in);
    int sum=0;
    for( int i=0;i<4;i++) {
        a[i] = s.nextInt();
        try {
            if(a[i]<0){
                throw new negative("This is a negative number");
            }else {
                sum=sum+a[i];
            }
        }catch(negative e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
    
}
