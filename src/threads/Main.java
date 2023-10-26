package threads;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!!");
        System.out.println("Starting the application from thread: " + Thread.currentThread().getName());

        int a = 2;
        int b = 3;

        HelloWorldPrinter hwp = new HelloWorldPrinter();
        // System.out.println("Calling run() method on HWP object...");
        System.out.println("Initializing thread with the task created...");
        Thread thread = new Thread(hwp);
        System.out.println("Starting a new thread from thread: " + Thread.currentThread().getName());
        thread.start();
        System.out.println("-----At the end of the main thread-----");
    }
}
