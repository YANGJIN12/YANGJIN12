package day03;

public class OperatorTest2 {
	public static void main(String[] args) {
		
		//���� ������
		
		System.out.println("---int - ???---");
		System.out.println(10-10);// int - int > int
		System.out.println(10-3.14);// int - double > double
		System.out.println(10-'a');// int - char > int
//		System.out.println(10-"hello") int - String > error(�Ұ���)
		
		System.out.println("---double -???---");
		System.out.println(10.23-10);// double - int > double
		System.out.println(10.13-4.1);// double - double > double
		System.out.println(10.13-'a');// double - char > double
//		System.out.println(10.23-"hello"); double - String > error(�Ұ���)
		
		System.out.println("---char -???---");
		System.out.println('a'-'b');// char - char > int
//		System.out.println('a'-"hello"); char - String > error(�Ұ���)
		
		
		System.out.println("---String - String---");
//		System.out.println("abcd"-"abc");String - String > error(�Ұ���)
		
		

}
}