package firstassi;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args)
	{
		int n,c,fact=1;
		
		System.out.println("Enter a number");
		Scanner a = new Scanner(System.in);
		n=a.nextInt();
		
		for(c=1;c<=n;c++)
		{
			fact = fact*c;
		}
		
		System.out.println("The factorial value of the given number is:"+fact);
	}
}
