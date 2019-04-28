package javastudy.week2.exercise;

public class Exam2 
{
	public static void main(String[] args) 
	{		
		int sum=0;
		
		System.out.print("1 부터 100 까지의 합 = ");
		for(int i=1; i<=100; i++)
		{
			sum += i;
		}
		
		System.out.print(sum);
	}
}