public class exception9 {
    public static void main(String args[]){
        Thread t=Thread.currentThread();
        System.out.println("current thread"+t);
        t.setName("my thread");
        System.out.println("change thread"+t);
        try{
            for(int i=0; i<10; i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("main thread interrupted");

        }

    }
    
}
