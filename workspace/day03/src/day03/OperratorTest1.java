package day03;

public class OperratorTest1 {
	public static void main(String[] args) { 
	//+���� ������
		
	System.out.println("--int+??? ---");
	System.out.println(10+10); // int + int > int
	System.out.println(10+3.14); // int + double > double
	System.out.println(10+'a'); // int + char > int : 107
	System.out.println(10+"hello");// int + String > String(����)
	
	
	System.out.println("--double + ??? ---");
	System.out.println(3.14+10);// double + int > double
	System.out.println(3.14+2.5);// double + double > double
	System.out.println(3.5+1.5);// double + double > �������̾ double
	System.out.println(3.14+'a');// double + char > double
	System.out.println(3.14+"hello");// double + String > String(����)
	
	System.out.println("---char+???---");
	System.out.println('a'+3);// char + int > int
	System.out.println('a'+3.14);// char + double > double
	System.out.println('a'+'b');// char + char > int
	System.out.println('a'+"hello");//char + String(����)
	
	
	System.out.println("---String + ???---");
	System.out.println("hello"+3);// String + int > String(����)
	System.out.println("hello"+3.14);// String + double(����)
	System.out.println("hello"+'a');// String + double(����)
	System.out.println("hello"+"abc");// String + String > String(����)
	
	String name = "�����";
	System.out.println("�̸�: "+name);
	
	

}

	
}