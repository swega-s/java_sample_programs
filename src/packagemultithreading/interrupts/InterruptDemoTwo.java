package packagemultithreading.interrupts;

class MainThreadTwo extends Thread {
    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            System.out.println("hello");
        }
        try{
            Thread.sleep(1000);
        }catch (InterruptedException exception) {
            System.out.println("got interrupted");
        }
    }
}

public class InterruptDemoTwo {
    public static void main(String[] args) {
        MainThreadTwo myThread = new MainThreadTwo();
        myThread.start();

        myThread.interrupt();
        System.out.println("End of main thread");
    }
}
