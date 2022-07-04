package day03;

public class OperatorTest3 {
	public static void main(String[] args) {
		//곱셈 연산자
		
		System.out.println("---int * ???---");
		System.out.println(10*10);// int * int > int
		System.out.println(10*3.14);// int * double > double
		System.out.println(100*3.1);// 정수가 되는 경우에도 double
		System.out.println(10*'a');// int * char > int
//		System.out.println(10*"hello"); int * String > error
		
		System.out.println("---double * ???---");
		System.out.println(3.1*3.12);// double * double > double
		System.out.println(3.14*'a');//double * char > double
//		System.out.println(3.14*"hello"); double * String > error
		
		System.out.println("---char* ???---");
		System.out.println('a'*'a');// char * char > int
//		System.out.println('a'*"hello"); char*String > error 
		
		System.out.println("String*String");
//		System.out.println("hello"*"hello"); String * String > error
		
		

}
}