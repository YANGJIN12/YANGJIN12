package classtest;

public class Student {
	String name = "기본값";
	int kor;
	int eng;
	int math;
	public Student(String name,int kor,int eng,int math) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	


	
	public void setVariable(String name,int kor,int eng,int math) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
		
		
	
	

	
	
	
	
	
	
	
	
	

	public void show() {
		System.out.println("이름: "+this.name);
		System.out.println("국어 점수:"+this.kor);
		System.out.println("영어 점수:"+this.eng);
		System.out.println("수학 점수:"+this.math);
		
		

	}

}
