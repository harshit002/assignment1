package assignment23;

import java.util.Scanner;

public class reverse {
	
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();int d,s=0;
		int n=a;
		while(n>0)
		{
			d=n%10;
			s=s*10+d;
			n=n/10;
			
		}
		
		System.out.print("reverse of "+a+"=" +s);
		 
	}

}
