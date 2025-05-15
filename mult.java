public class mult {
  mult() {
    System.out.println("Classs 1");
  }  
}
class alt extends mult {
    alt() {
        super();
        System.out.println("Classs 2");
      } 

}

class bolt extends alt {
    bolt() {
        super();
        System.out.println("Classs 3");
      } 
      public static void main(String[] args) {
        bolt b= new bolt();
      }

}
