import java.util.Scanner; // Scanner ��Ű�� import

public class JavaStudy3 { //JavaStudy Ŭ����	
	public static void main(String[] args) { // main �޼ҵ�
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String n;
		int i;
		
		System.out.println("name?");
		n = sc.nextLine(); // ���� ���������� ���ڿ��� �Է� ���� ������ �ʿ��ϸ� nextLine()
		System.out.println(n);
		
		System.out.println("number?");
		i = sc.nextInt(); // next+�ڷ���()
		System.out.println(i);		
	}
}