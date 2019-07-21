package main.java.firemans;

public class Main {
    public static void main(String[] args) {
        FireManWaitThread fmWaiting = new FireManWaitThread();
        FireManWorkingThread fmWorking = new FireManWorkingThread();
        AlarmThread alarm = new AlarmThread();

        fmWaiting.start();
        alarm.start();
        fmWorking.start();
    }
}
