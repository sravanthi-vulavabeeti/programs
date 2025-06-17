class MyDaemonThread extends Thread {
    public MyDaemonThread(String name) {
        super(name);
    }

    
    public void run() {
        while(true){
            try {
                System.out.println(Thread.currentThread().getName() + " is running");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " is interrupted");
                break;
            }
        }
        System.out.println(Thread.currentThread().getName() + " is stopped");
    }
}

public class DaemonThreadExample {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread daemonThread = new MyDaemonThread("Daemon Thread");
        daemonThread.setDaemon(true); 
        daemonThread.start();

        Thread.sleep(3000); 
        System.out.println("Main thread completed");
    }
}