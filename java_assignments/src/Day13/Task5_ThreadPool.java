/*
 * Task 5: Thread Pools and Concurrency Utilities
Create a fixed-size thread pool and submit multiple tasks that perform complex 
calculations or I/O operations and observe the execution.
 */

package Day13;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ThreadPoolIO implements Callable<Integer> {
    private int number;

    public ThreadPoolIO(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        // Simulate a complex calculation
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += i;
            // Simulate delay
            Thread.sleep(100);
        }
        System.out.println(Thread.currentThread().getName() + " calculated sum of " + number + " = " + result);
        return result;
    }
}

public class Task5_ThreadPool {
    public static void main(String[] args) {
        int numberOfTasks = 5;
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Create a list to hold Future objects
        List<Future<Integer>> futures = new ArrayList<>();

        for (int i = 1; i <= numberOfTasks; i++) {
        	ThreadPoolIO task = new ThreadPoolIO(i * 10);
            Future<Integer> future = executorService.submit(task);
            futures.add(future);
        }

        // Wait for all tasks to complete and print their results
        for (Future<Integer> future : futures) {
            try {
                System.out.println("Result: " + future.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Shutdown the executor service
        executorService.shutdown();
    }


}
