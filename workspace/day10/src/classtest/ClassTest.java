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
		//Student():생성자
		//new : 메모리에 할당 시켜주는 연산자
		//kim : 객체, 인스턴스
		
		
//		kim.name="김철수";
//		//클래스, 인스턴스 내부 요소에 접근할때는 하위 연산자(.)을 사용
//		kim.kor=80;
//		kim.eng=90;
//		kim.math=85;
		
		
		kim.setVariable("김철수",80,90,85);
		
		
		
		
		
		
		System.out.println("학생정보 보기");
		System.out.println("이름"+kim.name);
		System.out.println("국어점수:"+kim.kor);
		System.out.println("영어점수:"+kim.eng);
		System.out.println("수학점수:"+kim.math);
	}

}

class Car{
	String name;
	int price;
	
	
	public static void powerOn() {
		System.out.println("시동을 켭니다.");
		
	}
	
	public static void go() {
		System.out.println("앞으로 갑니다.");
		
		
	}
}