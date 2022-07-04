

public class LifeCycleTest {
	
	public static int changeA(int a) {
		a=1000;
		int b=a;
		return b;
	}
	public static void main(String[]args) {
		changeA(10);	
		  int b;
		  b=100;

		  
		  System.out.print(b);
//		  
//		  String b;
//		  b="b";
//		  System.out.println(b);
//		  	
		  
		
		
		
		for(int i=0;i<3;i++) {
			System.out.println(i);
			//해당영역에서만 i를 사용할수 있음
		}
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}
}
