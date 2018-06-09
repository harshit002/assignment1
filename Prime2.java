package assignment23;

import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		for(int j=2;j<=(i/2);j++)
		{
			if(i%j!=0)
				System.out.print(i+"  ");
			    break;
		}
				

	}

}

}