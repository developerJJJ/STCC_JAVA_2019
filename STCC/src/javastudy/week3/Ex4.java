package javastudy.week3;

public class Ex4 {

	public static void main(String[] args) 
	{
		int n = 51;
		int sum = 0;
		
		if(n<50)
		{			
			for(int i=0; i<n; i++)
				sum += i;
			
			System.out.println(sum);
		}
		else if(n>50)
			System.out.println("n은 50 보다 큽니다.");
		else
		{			
		}
	}
	
}