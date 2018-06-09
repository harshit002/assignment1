package assignment23;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		    int num[] = new int[5];
		    for(int i=0;i<5;i++)
		    	num[i]=sc.nextInt();
		int i, j, temp;  
	     for ( i = 0; i < num.length - 1; i ++ )  
	     {
	          for ( j = i + 1; j < num.length; j ++ )
	          {
	               if( num[ i ] < num[ j ] )       
	               {
	                       temp = num[ i ];   
	                       num[ i ] = num[ j ];
	                       num[ j ] = temp; 
	                }           
	          }
	     }
	     
	     System.out.println("Sorte array is as follows: ");
	     
	     for ( i = 0; i < num.length - 1; i ++ )  
	        System.out.println(num[i]);
	     
	     
	}

}
