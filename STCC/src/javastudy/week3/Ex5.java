package javastudy.week3;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		
		String input;

		System.out.println("press q to quit program");
		input = sc.next();
		
		while(true)
		{
			if(input.equals("q"))
			{
				System.out.println("End program");
				System.exit(0);
			}
			System.out.println("input is "+input);
			System.out.println("program is running..");
			System.out.println("press q to quit program");
			input = sc.next();
		}

	}

}
