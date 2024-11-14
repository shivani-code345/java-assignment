public class exception1 {
    public static void main(String[] args)
    {
        fun();
        System.out.println(10/0);
    }
    public static void fun()
    {
        moreFun();
        System.out.println("hello");
    }
    public static void moreFun()
    {
       // System.out.println(10 / 0);
        System.out.println("Method moreFun");
    }
}