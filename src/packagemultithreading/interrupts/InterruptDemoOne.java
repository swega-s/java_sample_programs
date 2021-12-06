package packagemultithreading.interrupts;

class MainThread extends Thread {
    @Override
    public void run() {
        try{
            for (int i=0;i<10;i++) {
                System.out.println("hello");
                Thread.sleep(100);
            }
        }catch (InterruptedException exception) {
            System.out.println("got interrupted");
        }
    }
}

public class InterruptDemoOne {
    public static void main(String[] args) {
        MainThread myThread = new MainThread();
        myThread.start();

        myThread.interrupt();
        System.out.println("End of main thread");
    }
}
