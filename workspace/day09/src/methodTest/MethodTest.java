package methodTest;

public class MethodTest {
	//정수의 합을 반환하는 메소드
	
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
		return "안녕";
		//메소드 오버로딩!!
	}
	
	public static void main(String[]args) {
		System.out.println(MethodTest.add("1",3));
		
	}

	
}
