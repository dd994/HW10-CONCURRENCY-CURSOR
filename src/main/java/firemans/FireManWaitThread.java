package main.java.firemans;

public class FireManWaitThread extends Thread  {
    @Override
    public void run()   {
            FiremanDay fdWait = new FiremanDay();
            fdWait.waitFor();
    }
}
