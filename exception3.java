public class exception3 {
    public static void main(String argd[]){
        System.out.println("statement1");
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            //System.out.println(e);
            System.out.println(e.toString());
            System.out.println(e.getMessage());

           // e.printStackTrace();

        }
        System.out.println("statement 3");
 
    }
}
