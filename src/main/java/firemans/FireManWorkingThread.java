package main.java.firemans;

public class FireManWorkingThread extends Thread {
    @Override
    public void run()   {
        try {
            FiremanDay fd = new FiremanDay();
            Thread.sleep(7000);
            fd.heardAlarm();
            Thread.sleep(10000);
            fd.extinguishTheFire();
            Thread.sleep(12000);
            fd.finishExtinguish();
        }  catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
