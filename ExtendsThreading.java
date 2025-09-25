class MyThread1 extends Thread{
    public void run(){
        while (true) {
            System.out.println("Thread is playing");            
        }
    }

}
class MyThread2 extends Thread{
    public void run(){
        while (true) {
            System.out.println("Thread is chatting");            
        }
    }
    
}
public class ExtendsThreading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
        
    }
    
}
