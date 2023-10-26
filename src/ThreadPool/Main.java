package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int number = 1; number <= 100 ; number++) {
            if (number == 80) {
                System.out.println("STOP");
            }
            NumberPrinter numberPrinter = new NumberPrinter(number);
            Thread thread = new Thread(numberPrinter);
            thread.start();
        }
    }
}
