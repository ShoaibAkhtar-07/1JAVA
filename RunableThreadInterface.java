class MyThread_1 implements Runnable{
    public void run(){
        while (true) {
            System.out.println("Thread is playing");            
        }
    }

}
class MyThread_2 implements Runnable{
    public void run(){
        while (true) {
            System.out.println("Thread is chatting");            
        }
    }
    
}

public class RunableThreadInterface {
    public static void main(String[] args) {
        MyThread_1 t1 = new MyThread_1();
        MyThread_2 t2 = new MyThread_2();
        // Thread tt1 = new Thread(t1);
        // Thread tt2 = new Thread(t2);
        t1.start();
        t2.start();  
    }
}
