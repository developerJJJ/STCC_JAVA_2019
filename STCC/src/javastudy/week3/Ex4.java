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
			System.out.println("n�� 50 ���� Ů�ϴ�.");
		else
		{			
		}
	}
	
}