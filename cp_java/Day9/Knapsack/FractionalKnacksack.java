package Knapsack;

import java.io.IOException;
import java.util.Scanner;

public class FractionalKnacksack {
	public static void main(String args[]) throws IOException
	   {
	       int i,j=0,max_qty,m,n;
	       float sum=0,max;
	       Scanner sc = new Scanner(System.in);
	       float array[][]=new float[2][20];
	       System.out.println("Enter no of items");
	       n=sc.nextInt();

	       System.out.println("Enter the weights of each items");
	       for(i=0;i<n;i++)
	           array[0][i]=sc.nextFloat();

	       System.out.println("Enter the values of each items");
	       for(i=0;i<n;i++)
	           array[1][i]=sc.nextFloat();

	       System.out.println("Enter maximum volume of knapsack :");
	       max_qty=sc.nextInt();

	       m=max_qty;
	       while(m>=0)
	       {
	           max=0;
	           for(i=0;i<n;i++)
	           {
	               if(array[1][i]/(array[0][i])>max)
	               {
	                   max = array[1][i]/array[0][i];
	                   j=i;
	               }
	           }
	           if(array[0][j]>m)
	           {
	               System.out.println("Quantity of item number: " +  (j+1) + " added is " +m);
	               sum+=m*max;
	               m=-1;
	           }
	           else
	           {
	               System.out.println("Quantity of item number: " + (j+1) + " added is " + array[0][j]);
	               m-=array[0][j];
	               sum+=array[1][j];
	               array[1][j]=0;
	           }
	       }
	       System.out.println("The total profit is " + sum);
	       sc.close();
	   }

}
