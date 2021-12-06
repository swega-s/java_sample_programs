package packagemultithreading;

class MyThread {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName() + "started");

            try {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Hello " + i);
                }
                Thread.sleep(3000);
                for (int i = 10; i > 0; i--) {
                    System.out.println("Hey " + i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "ended");
        };

        Thread thread = new Thread(runnable, "My Thread 1 ");
        thread.start();

        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyRunnableThread implements Runnable {
    @Override
    public void run() {
        doSomething();
    }

    private void doSomething() {
        SampleMultipleThreads s = new SampleMultipleThreads();
        System.out.println(Thread.currentThread().getName());
        someMethod(s);
    }

    private void someMethod(SampleMultipleThreads sObj) {
        sObj.printName();
    }
}

class NotThreadSafe{
    StringBuilder builder = new StringBuilder();

    public void add(String text){
        this.builder.append(text);
        System.out.println(text);
    }
}

class MyRunnable implements Runnable{
    NotThreadSafe instance = null;

    public MyRunnable(NotThreadSafe instance){
        this.instance = instance;
    }

    public void run(){
        this.instance.add("some text");
        System.out.println(this.instance);
    }
}

class SampleMultipleThreads {

    public void printName() {
        System.out.println("My name is swega " + Thread.currentThread().getName());
    }

//    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName());
//        for(int i=0; i<10; i++){
//            new Thread("" + i){
//                public void run(){
//                    try {
//                        Thread.sleep(10L * 1000L);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println("Thread: " + getName() + " running");
//                }
//            }.start();
//        }
//    }

//    public static void main(String[] args) {
//        Thread thread1 = new Thread(new MyRunnableThread(), "My thread 1");
//        Thread thread2 = new Thread(new MyRunnableThread(), "My thread 2");
//        thread1.start();
//        thread2.start();
//    }

    public static void main(String[] args) {
        NotThreadSafe sharedInstance = new NotThreadSafe();

        new Thread(new MyRunnable(new NotThreadSafe())).start();
        new Thread(new MyRunnable(new NotThreadSafe())).start();
    }
}