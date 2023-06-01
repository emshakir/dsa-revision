package dsa.revision.others.Threads;

public class NewThread extends Thread {

    public void run() {
        long startTime = System.currentTimeMillis();
        int i = 0;
        while (true) {
            System.out.println(this.getName() + ": New Thread is running..." + i++);
            try {
                //Wait for one sec so it doesn't print too fast
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        NewThread t = new NewThread();
        t.start();
        int i = 0;
        while (true) {
            try {
                //Wait for one sec so it doesn't print too fast
                System.out.println("Main Thread ::: ");
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
