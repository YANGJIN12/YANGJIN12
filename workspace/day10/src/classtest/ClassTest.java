package classtest;

public class ClassTest {
	public static void showStudent(Student s) {
		System.out.println(s.name);
		System.out.println(s.kor);
		System.out.println(s.eng);
		System.out.println(s.math);
		
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	public static void main(String[]args) {
		Student kim = new Student();
		//Student():������
		//new : �޸𸮿� �Ҵ� �����ִ� ������
		//kim : ��ü, �ν��Ͻ�
		
		
//		kim.name="��ö��";
//		//Ŭ����, �ν��Ͻ� ���� ��ҿ� �����Ҷ��� ���� ������(.)�� ���
//		kim.kor=80;
//		kim.eng=90;
//		kim.math=85;
		
		
		kim.setVariable("��ö��",80,90,85);
		
		
		
		
		
		
		System.out.println("�л����� ����");
		System.out.println("�̸�"+kim.name);
		System.out.println("��������:"+kim.kor);
		System.out.println("��������:"+kim.eng);
		System.out.println("��������:"+kim.math);
	}

}

class Car{
	String name;
	int price;
	
	
	public static void powerOn() {
		System.out.println("�õ��� �մϴ�.");
		
	}
	
	public static void go() {
		System.out.println("������ ���ϴ�.");
		
		
	}
}