package org.crazycoder.threads;

public class ThreadPrinter extends Thread{
    @Override
    public void start(){
        System.out.println("This is from printer class start method "+ currentThread().getName());
        super.start();
    }


    @Override
    public void run() {
        for (int i=0; i<10;i++){
            System.out.println(i +" : " +currentThread().getName());
        }
    }
}
