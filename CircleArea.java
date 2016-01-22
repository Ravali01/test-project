package Basicprograms;

import java.util.Scanner;

public class CircleArea {
	
	public static void main(String[] args)
	{
		System.out.println("Enter radius");
		Scanner a = new Scanner(System.in);
		int h = a.nextInt();
		int b = a.nextInt();
		
		double area;
		area = 0.5*b*h;
		
		System.out.println("Area:"+area);
		
	}

}
