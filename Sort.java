import java.util.Scanner;
public class Sort {
    
    public static void main(String[] args) {
        System.out.print("Enter your size:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter element:");
            ar[i]=sc.nextInt();
        }
        int t;
        for(int i=0;i<n;i++) {
            for ( int j=i+1;j<n;j++){
                if(ar[i]>ar[j]){
                    t=ar[i];
                    ar[i]=ar[j];
                    ar[j]=t;
                }
            }
        }
        System.out.println("SORTED ARRAY:");
        for(int i=0;i<n;i++){
            System.out.print(ar[i]);
        }
    }
    
}
