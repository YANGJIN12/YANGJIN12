package day03;

public class OperratorTest1 {
	public static void main(String[] args) { 
	//+덧셈 연산자
		
	System.out.println("--int+??? ---");
	System.out.println(10+10); // int + int > int
	System.out.println(10+3.14); // int + double > double
	System.out.println(10+'a'); // int + char > int : 107
	System.out.println(10+"hello");// int + String > String(연결)
	
	
	System.out.println("--double + ??? ---");
	System.out.println(3.14+10);// double + int > double
	System.out.println(3.14+2.5);// double + double > double
	System.out.println(3.5+1.5);// double + double > 정수값이어도 double
	System.out.println(3.14+'a');// double + char > double
	System.out.println(3.14+"hello");// double + String > String(연결)
	
	System.out.println("---char+???---");
	System.out.println('a'+3);// char + int > int
	System.out.println('a'+3.14);// char + double > double
	System.out.println('a'+'b');// char + char > int
	System.out.println('a'+"hello");//char + String(연결)
	
	
	System.out.println("---String + ???---");
	System.out.println("hello"+3);// String + int > String(연결)
	System.out.println("hello"+3.14);// String + double(연결)
	System.out.println("hello"+'a');// String + double(연결)
	System.out.println("hello"+"abc");// String + String > String(연결)
	
	String name = "김양진";
	System.out.println("이름: "+name);
	
	

}

	
}