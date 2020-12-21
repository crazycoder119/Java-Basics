package org.crazycoder.threads;

public class Application {
    public static void main(String[] args) {
//        ThreadPrinter printer = new ThreadPrinter();
//        printer.start();
//        System.out.println("This is from main method ");

        RunnablePrinter runnablePrinter = new RunnablePrinter();
        Thread thread = new Thread(runnablePrinter);
        thread.start();
        thread.interrupt();

    }
}
