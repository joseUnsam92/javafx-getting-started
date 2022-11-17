package org.openjfx;

public class Multithreading {
    public static void main (String[] args){
        for (int i = 0; i <= 3; i++){
            TestThread theThread = new TestThread(i);
            theThread.start();
        }
    }
}
