package com.deloitte;
import java.util.Scanner;
public class qs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int sum=0;
		int rev,n;
		System.out.println("Enter a digit");
		 n=sc.nextInt();
		while(n>0)
		{
			rev=n%10;
			n=n/10;
			if(rev%2!=0)
			sum=sum+rev;
			
			
		}
		System.out.println(sum);
		

	}

}
