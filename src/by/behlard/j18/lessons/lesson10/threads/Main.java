package by.behlard.j18.lessons.lesson10.threads;

//@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new MyThread("thread1");
        Thread thread2 = new Thread(new MyRunnableThread("thread2"));
        Thread threadDaemon = new Thread(() -> {
            while (true) {
                try {
                    for (; ; ) {
                        Thread.sleep(200);
                        System.out.print(".");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        threadDaemon.setDaemon(true);

        thread1.start();
        thread2.start();
        threadDaemon.start();
//        thread1.join();
//        thread2.join();


        for (int i = 1; i <= 5; i++)
            System.out.print(".");

        System.out.println("\nEND");
    }
}
