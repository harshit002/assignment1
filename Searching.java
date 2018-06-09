package assignment23;

import java.util.Scanner;

public class Searching 
{
	public static int binarySearch(int arr[], int first, int last, int key)
	{
	  int mid;
	   mid = (first + last)/2;  
	   while( first <= last )
	   {  
	      if ( arr[mid] < key )
	      {  
	        first = mid + 1;     
	      }
	      else if ( arr[mid] == key )
	      {
	    	
	        
	        return mid;  
	      }
	      else
	      {  
	         last = mid - 1;  
	      }  
	      
	      mid = (first + last)/2;  
	   }  
	  
	   
	   return -1;
	}
	  
	   public static void main(String args[])
	   {  
		   Scanner sc=new Scanner(System.in);
		    int arr[] = new int[5];
		    for(int i=0;i<5;i++)
		    	arr[i]=sc.nextInt();
		    int key=sc.nextInt(); 
	        int last=arr.length-1;  
	        int result = binarySearch(arr,0,last,key);  
	        if (result == -1)  
	            System.out.println("Element is not found!");  
	        else  
	            System.out.println("Element is found at index: "+result);  
	    }  
	   
}
	   
	     