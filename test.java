public class test {
    int a,b;
    test(int x , int y){
        a=x;
        b=y;
    }
    boolean equals(test ob){
        if(ob.a==a && ob.b==b){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        test o1=new test(10, 20);
        test o2 =new test(10, 20);
        test o3 = new test(1, 5);
        System.out.println("o1==o2\n"+o1.equals(o2));
        System.out.println("o1==o3\n"+o1.equals(o3));
    }
   
}
