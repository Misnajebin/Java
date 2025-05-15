import java.util.Scanner;

public class matrix {
    int r;
    int c;
    int arr[][]=new int[10][10];
    matrix(int r,int c){
        this.r=r;
        this.c=c;
    }
    void insert(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element to insert");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void display(){
        System.out.println("YOUR MATRIX");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    void transporse(){
        System.out.println("Transporse MATRIX");
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(arr[j][i]+"\t");
            }
            System.out.println();
        }
    }
    void add(matrix m){
        matrix A=new matrix(r, c);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                A.arr[i][j]=arr[i][j]+m.arr[i][j];
            }
        }
        System.out.println("After Addition");
        A.display();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows and columns");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        matrix m1=new matrix(r1, c1);
        m1.insert();
        m1.display();
        m1.transporse();
        System.out.println("enter the number of rows and columns");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        matrix m2=new matrix(r2, c2);
        m2.insert();
        m2.display();
        m1.add(m2);

    }
}
