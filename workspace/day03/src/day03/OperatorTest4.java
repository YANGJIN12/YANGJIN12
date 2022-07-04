package day03;

public class OperatorTest4 {
	public static void main(String[] args) {
		//나눗셈 연산자
		
		System.out.println("---int/???---");
		System.out.println(10/3);// int / int > int(몫이 나옴)
		System.out.println(10/2.5);// int / double > double
		System.out.println(10/'a');// int / char > int(몫이 나옴)
//		System.out.println(10/"hello"); int / Stirng > error
		
		//String 타입은 나눗셈연산이 불가능
		
		System.out.println("---double / ???---");
		System.out.println(3.14/10);// double / int > double
		System.out.println(3.14/2.5);// double / double > double
		System.out.println(10.0/3);// 더 정확한 값을 보기 위해 하나를 더블타입으로 바꿈
		System.out.println(15.5/'a');// double / char > double
//		System.out.println(13.4/"hello"); double / String > error
		
		
		System.out.println("---char/???---");
		System.out.println('a'/3);// char / int > int(몫이 나옴)
		System.out.println('a'/2.5);// char / double > double
		System.out.println('a'/'b');// char / char > int(몫이 나옴)
//		System.out.println('a'/"hello");
		
//		System.out.println("hello"/"hello");
		
		
		System.out.println(10/0);// 0으로 나눌수 없음
		
		
		//나머지 연산자
		System.out.println(10%'a');

	}
}