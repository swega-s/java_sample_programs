package packagemultithreading.threadcreation;


// using Runnable interface in an anonymous class
class ThreadThree {

    public static void main(String[] args) {
        Thread myThread = new Thread( new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        } );
        myThread.start();
    }

}
