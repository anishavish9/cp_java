/*
 * Task5 :Executors, Concurrent Collections, CompletableFuture
Use an ExecutorService to parallelize a task that calculates prime numbers up to a 
given number and then use CompletableFuture to write the results to a file asynchronously.
 */

package Day13;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task5_CompletableFuturePrime {
    // Method to calculate prime numbers in a given range
    public static List<Integer> calculatePrime(int start, int end) {
        List<Integer> primes = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    // Method to check if a number is prime
    public static boolean isPrime(int x) {
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to write prime numbers to a file
    public static void writeToFile(List<Integer> primes) {
        try (PrintWriter writer = new PrintWriter(new File("newFile.txt"))) {
            for (Integer prime : primes) {
                writer.println(prime);
            }
            System.out.println("Written to the file");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Main method
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int range = 1000;
        int tasks = 4;

        // Create a fixed-size thread pool
        ExecutorService executor = Executors.newFixedThreadPool(tasks);
        List<Future<List<Integer>>> futures = new ArrayList<>();
        
        int limit = range / tasks;
        for (int i = 0; i < tasks; i++) {
            int start = i * limit + 1;
            int end = (i == tasks - 1) ? range : (i + 1) * limit;
            futures.add(executor.submit(() -> calculatePrime(start, end)));
        }

        List<Integer> primeNumbers = new ArrayList<>();
        for (Future<List<Integer>> future : futures) {
            try {
                primeNumbers.addAll(future.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        // Shutdown the executor service
        executor.shutdown();

        // Use CompletableFuture to write to file asynchronously
        CompletableFuture.runAsync(() -> writeToFile(primeNumbers))
                         .thenRun(() -> System.out.println("File write operation completed"))
                         .exceptionally(ex -> {
                             ex.printStackTrace();
                             return null;
                         }).get();
    }
}
