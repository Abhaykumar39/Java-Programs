class sumdemo extends Thread {
    int sum = 0;

    public void run() {
        synchronized (this) {
            for (int i = 0; i <= 50; i++) {
                sum = sum + i;
            }
            this.notify();
        }

    }
}

public class Interthread_Communication {
    public static void main(String[] args) throws Exception {
        sumdemo th = new sumdemo();
        th.start();
        synchronized (th) {
            th.wait();
            System.out.println("Sum is: " + th.sum);
        }
    }

}
