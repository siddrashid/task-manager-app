package threads;

public class HelloWorldPrinter implements Runnable {
    public static void doSomething() {
        int c = 4;
        int d = 5;

        System.out.println("Inside doSomething() function stack.");
        System.out.println("Thread: " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        // System.out.println("Hello World!");
        System.out.println("Inside run() method of the runnable interface.");
        System.out.println("Thread: " + Thread.currentThread().getName());
        System.out.println("Calling doSomething()....");
        doSomething();
    }
}
