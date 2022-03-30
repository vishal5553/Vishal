//Q 1 wap to ask a number and print sum and count and average  of digits .

package pack2;

import java.util.*;

public class Q1 {
	
	int rem;
	int sum=0;
	
	
	String len;
	/*
	void input()
	{
		System.out.println("Enter a number: ");
		Scanner s=new Scanner (System.in);
		num=s.nextInt();
	}*/
	
	void printsum(int num)
	{
		while(num>0)
		{
			rem=num % 10;
			sum=sum + rem;
			num=num/10;
			
		}
		System.out.println("Sum of digits of given number is: "+sum);
	}
	
	void countdigits(int num)
	{ 
		int temp=0;
		while(num>0)
		{
			temp++;
			num=num/10;
		}
		System.out.println("Count of digits of Number is: "+temp);
		
	}
	
	void AvgDigit(int num)
	{
		int count=0;
		int add=0;
		while(num>0)
		{
			rem=num % 10;
			count++;
			add=add+rem;
			num=num/10;
		}
		
		System.out.println("Average of digits of a number is: "+(add/count));
	}

	public static void main(String[] args) {
		int num;
		
		Q1 z=new Q1();
		
		System.out.println("Enter a number: ");
		Scanner s=new Scanner (System.in);
		num=s.nextInt();
		
		//z.input();
		z.printsum(num);
		z.countdigits(num);
		z.AvgDigit(num);
		
		
	}

}
