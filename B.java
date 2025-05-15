import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        
        // int[] array;
        // array=new int[n];
        int array[] = new int[n];
       
        for(int i=0;i<n;i++){
            System.out.print("enter the "+(i+1)+" element:");
             array[i]=sc.nextInt();
        }
        System.out.println("Array Elements are:");
        for(int j=0;j<n;j++){
            System.out.print(array[j]+"\t");
        }
        System.err.println();
        int l = array.length;
        System.out.println("The size of array is :" + l);

    }
}
