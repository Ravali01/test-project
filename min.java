package firstassi;

public class min {
	
	public static void main(String args[])
	{
		int a=10,b=20,c=5,d=3;
		int minimum;
		minimum = min1(a,(min1(b,(min1(c,d)))));
		System.out.println("Minimun of four numbers is:"+minimum);
	}

int min1(int x,int y)
{
   int m=0;
   if(x<y)
   {
	   m = x;
	   return m;
   }
   else if(y<x)
   {
	   m=y;
	   return m;
   }
   else
	   return 0;
}
}