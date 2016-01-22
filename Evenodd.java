package Basicprograms;

import java.util.Scanner;

public class Evenodd {
	
	public static void main(String[] args)
	{
		System.out.println("Enter number");
		Scanner a = new Scanner(System.in);
		int num = a.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}

}
