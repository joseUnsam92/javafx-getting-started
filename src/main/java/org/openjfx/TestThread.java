package org.openjfx;

public class TestThread extends Thread {
    private int ThreadNumber;

    public TestThread(int ThreadNumber) {
        this.ThreadNumber = ThreadNumber;
    }

    @Override
    public void run() {
        System.out.println("The thread is now running from thread number " + ThreadNumber);

    try

    {
        Thread.sleep(1000);
    } catch(InterruptedException e){

    }
}
}