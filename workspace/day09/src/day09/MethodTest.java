package day09;

public class MethodTest {
	public static void printName(String name,int a) {
		for(int i=0;i<a;i++) {
			System.out.println(name);
			
		}
		
	
//		return name;
	
	}
	public static int addNum(int a,int b) {
		System.out.println(a+b+"�� ��ȯ�մϴ�.");
		return a+b;
	}
	
	
	
	
	public static void main(String[]args) {
//		for(int i=0;i<5;i++) {
//			System.out.println("�����");
		
		MethodTest.printName("ȫ�浿",7);
		
		
		//�� ���� ���Ѱ���� �����ִ� �޼ҵ� �����
		int add=MethodTest.addNum(4,13);
		System.out.println("add:"+add);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

