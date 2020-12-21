package org.crazycoder.threads;

public class RunnablePrinter implements Runnable{

    @Override
    public void run() {
        for (int i=0; i<10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                System.out.println(interruptedException.toString());
            }
            System.out.println("Child : " +i);
        }
    }
}
