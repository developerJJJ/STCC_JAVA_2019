package javastudy.week3;

public class Ex3 
{
	public static void main(String[] args) 
	{
		int a = 3, b = 4, c = 2;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.print(a+" is the ");
			}
			else if(a==c)
			{
				System.out.print(a+" and "+c+" are two ");
			}
			else
			{
				System.out.print(c+" is the ");
			}
		}
		else if(a==b)
			if(a>c)
				System.out.print(a+" and "+b+" are the two");
			else if(a==c)
				System.out.print("All numbers are ");
			else
				System.out.print(c+" is the ");
		else // a<b
		{
			if(a>c || a==c)
				System.out.print(b+" is the ");
			else // a<b && a<c
			{
				if(b>c)
					System.out.print(b+" is the ");		
				else if(b==c)
					System.out.print(b+" and "+c+" are the two");
				else
					System.out.print(c+" is the ");
			}
		}
		System.out.print("largest number");
		
	}
}
