public class scope1{
  static  int a = 19;
  static int b = 5;
  static{
    System.out.println(a);
  }
   
  public static void main(String[] args) {
    int c = 34;
    int d = 23;
    // scope1 obj = new scope1();
    // scope1 obj = new scope1();
      // System.out.println(a);
  
    // System.out.println(obj.b);
    // System.out.println(obj.a);
    System.out.println(c);
    System.out.println(d);
  }        
}
