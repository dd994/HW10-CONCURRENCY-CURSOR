package main.java.firemans;

public class AlarmThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.println("Alarm!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
