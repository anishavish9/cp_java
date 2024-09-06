package Concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleExecutorEx {
	public static void main(String args[]) {
        ScheduledExecutorService sch = Executors.newScheduledThreadPool(1);
        Runnable task = () -> System.out.println("Scheduled task " + System.currentTimeMillis());
        sch.scheduleAtFixedRate(task, 0, 3, TimeUnit.SECONDS);
        
        // Correcting the shutdown schedule
        sch.schedule(() -> {
            sch.shutdown();
        }, 10, TimeUnit.SECONDS);
    }
}
