import java.util.Scanner; // Scanner 패키지 import

public class JavaStudy3 { //JavaStudy 클래스	
	public static void main(String[] args) { // main 메소드
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String n;
		int i;
		
		System.out.println("name?");
		n = sc.nextLine(); // 공백 이전까지의 문자열을 입력 받음 공백이 필요하면 nextLine()
		System.out.println(n);
		
		System.out.println("number?");
		i = sc.nextInt(); // next+자료형()
		System.out.println(i);		
	}
}