class MyRunnable implements Runnable {
    private int thread;

    public MyRunnable(int t) {
        this.thread = t;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + thread + " Count" + i);
        }
    }
}

class RunnableImpl {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Thread t = new Thread(new MyRunnable(i));
            t.start();
        }
        System.out.println("Main thread finished.");
    }
}