class MyThread_1 extends Thread{
    public MyThread_1 (String name){
        super(name);
    }
    public void run(){
        // while (true) {
        //     System.out.println("Thread is playing");            
        // }
        System.out.println("Hi,i am theard 1 not threat");
    }

}
class MyThread_2 implements Runnable{
    public void run(){
        // while (true) {
        //     System.out.println("Thread is chatting");            
        // }
        System.out.println("Hi,i am theard 2 not threat");
    }
    
}

public class RunableThreadInterface {
    public static void main(String[] args) {
        MyThread_1 t1 = new MyThread_1("Shoaib");
        MyThread_2 t2 = new MyThread_2();
        Thread tt2 = new Thread(t2);
        t1.start();
        tt2.start();
        System.out.println(t1.getId());
        System.out.println(t1.getName());
    }
}
