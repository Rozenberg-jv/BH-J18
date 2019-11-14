package by.behlard.j18.lessons.lesson10.threads;

public class MyRunnableThread implements Runnable {

    private final String name;

    public MyRunnableThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        try {
            for (int i = 1; i <= 10; i++) {
                Thread.sleep(1000);
                System.out.println(name + " " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
