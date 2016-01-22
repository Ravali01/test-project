package firstassi;
import java.util.Scanner;

public class armstrong {
	
	public static void main(String[] args)
	{
		int n,temp,num=0,n1;
		
		System.out.println("Enter a number");
		Scanner a = new Scanner(System.in);
		n= a.nextInt();
		n1=n;
		
		while(n1!=0)
		{
		    temp = n1%10;
		    num= num+(temp*temp*temp);
		    n1= n1/10;
		}
		
		if(num==n)
		{
			System.out.println("The entered number is an armstrong number");
		}
		else
		{
			System.out.println("The entered number is not an armstrong number");
		
		}

		System.out.println("The entered number is an armstrong number");
	}
}

