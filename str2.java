public class str2 {
    public static void main(String[] args) {
        StringBuffer  s = new StringBuffer("abc");
        System.out.println(s);
        StringBuffer  c= new StringBuffer("def");
        System.out.println(s.append(c));
        String  st = new String("Java");
        System.out.println(st);
        System.out.println(s.insert(3,"xyz"));
        System.out.println(s.delete(3,5));
    }
}
