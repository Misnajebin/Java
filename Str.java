public class Str {
    public static void main(String[] args) {
        String s= "Hello ";
        System.out.println(s);
        String st = new String("World");
        System.out.println(s+st);
        System.out.println("Length of first string : " +  s.length());
        System.out.println("Length of second string : " +  st.length());

        System.out.println("Combined length : "+(s+st).length());
        
    }
}