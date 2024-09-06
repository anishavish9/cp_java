package Day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JobSequencing {

	List<Job> jobs;

	public JobSequencing(List<Job> jobs) {
		this.jobs = jobs;
	}
	
    //find job with best profit
	public void bestJobs() {
	    char todo[] = new char[5];  
	    int k;
	    for (Job j : jobs) {  // Iterate through the sorted list of jobs
	        k = j.getDeadLine() - 1;  // Convert deadline to zero-indexed (i.e., for deadline 1, k=0)
	        while (k >= 0 && todo[k] != '\0') {  // Find an available slot before the deadline
	            k--;  // Move to the previous time slot
	        }
	        if (k != -1)  // If a free slot is found
	            todo[k] = j.getId();  // Assign the job ID to that slot
	    }
	    // Display the scheduled jobs in the order of their execution
	    for (k =0;k < todo.length && todo[k] != '\0'; k++) {  
	        for (Job jj : jobs) {
	            if (jj.getId() == todo[k])
	                System.out.println("Id :" + jj.getId() + "  Profit :" + jj.getProfit() + "  DeadLine :" + jj.getDeadLine() + " ");
	        }
	    }
	}


	public void show() {
		System.out.print("Job ID| " + "DeadLine|" + "Profit  \n");
		for(Job job : jobs ) {
			System.out.print("  "+job.getId() + " \t " + job.getDeadLine() + "  \t " + job.getProfit() + "\n");
		}	
		System.out.println(" ");
	}

	public static void main(String args[]) {
		List<Job> list = new ArrayList<>();
		list.add( new Job('c',2,100));
		list.add( new Job('b',3,200));
		list.add( new Job('d',3,150));
		list.add( new Job('e',2,130));
		list.add( new Job('f',4,80));
		
		JobSequencing obj = new JobSequencing(list);
		System.out.println("Displaying All the Jobs");
		obj.show();
		Collections.sort(list);

		System.out.println(" \nJobs To Do ");
		obj.bestJobs();

	}


}
