package packagemultithreading;

class JoinThreadExample implements Runnable {

    int[] numbers = {1, 2, 3, 4, 5};

    @Override
    public void run() {
        for (int i: numbers) {
            System.out.println("the number is : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MainClass {
    public static void main(String[] args) {
        Thread myThread = new Thread(new JoinThreadExample(), "My Join thread example");
        myThread.setDaemon(true);
        myThread.start();

        try {
//            Thread.sleep(100);
            myThread.join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
