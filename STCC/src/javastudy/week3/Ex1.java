package javastudy.week3;

public class Ex1 {

	public static void main(String[] args) 
	{
		// 삼항 연산자 예제
		int x = 0;
		String a = (x>0)? "양수": "음수";
		a = (x == 0)? "0": a;		
		System.out.print(a);	
	}

}
