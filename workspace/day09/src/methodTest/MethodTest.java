package methodTest;

public class MethodTest {
	//������ ���� ��ȯ�ϴ� �޼ҵ�
	
	public static int add(int a,int b) {
		return a+b;
	}
	
	
	public static int add(int a,int b,int c) {
		return a+b+c;
	}
	
	public static int add(int a,int b,int c,int d) {
		return a+b+c+d;
	}
	
	public static String add(String a,int b,int c,int d) {
		return "�ȳ�";
		//�޼ҵ� �����ε�!!
	}
	
	public static void main(String[]args) {
		System.out.println(MethodTest.add("1",3));
		
	}

	
}
