package day03;

public class OperatorTest4 {
	public static void main(String[] args) {
		//������ ������
		
		System.out.println("---int/???---");
		System.out.println(10/3);// int / int > int(���� ����)
		System.out.println(10/2.5);// int / double > double
		System.out.println(10/'a');// int / char > int(���� ����)
//		System.out.println(10/"hello"); int / Stirng > error
		
		//String Ÿ���� ������������ �Ұ���
		
		System.out.println("---double / ???---");
		System.out.println(3.14/10);// double / int > double
		System.out.println(3.14/2.5);// double / double > double
		System.out.println(10.0/3);// �� ��Ȯ�� ���� ���� ���� �ϳ��� ����Ÿ������ �ٲ�
		System.out.println(15.5/'a');// double / char > double
//		System.out.println(13.4/"hello"); double / String > error
		
		
		System.out.println("---char/???---");
		System.out.println('a'/3);// char / int > int(���� ����)
		System.out.println('a'/2.5);// char / double > double
		System.out.println('a'/'b');// char / char > int(���� ����)
//		System.out.println('a'/"hello");
		
//		System.out.println("hello"/"hello");
		
		
		System.out.println(10/0);// 0���� ������ ����
		
		
		//������ ������
		System.out.println(10%'a');

	}
}