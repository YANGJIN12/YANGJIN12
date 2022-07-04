package day09;

public class MethodTest {
	public static void printName(String name,int a) {
		for(int i=0;i<a;i++) {
			System.out.println(name);
			
		}
		
	
//		return name;
	
	}
	public static int addNum(int a,int b) {
		System.out.println(a+b+"를 반환합니다.");
		return a+b;
	}
	
	
	
	
	public static void main(String[]args) {
//		for(int i=0;i<5;i++) {
//			System.out.println("김양진");
		
		MethodTest.printName("홍길동",7);
		
		
		//두 수를 더한결과를 돌려주는 메소드 만들기
		int add=MethodTest.addNum(4,13);
		System.out.println("add:"+add);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

