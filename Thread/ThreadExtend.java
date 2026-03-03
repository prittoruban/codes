class MyThread extends Thread {

    private int thread;

    public MyThread(int t) {
        this.thread = t;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + thread + " Count: " + i);
        }
    }
}

class ThreadExtend {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            MyThread t = new MyThread(i);
            t.start();
        }
        System.out.println("Main thread finished.");
    }
}