package classtest;

public class Student {
	String name = "�⺻��";
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
		System.out.println("�̸�: "+this.name);
		System.out.println("���� ����:"+this.kor);
		System.out.println("���� ����:"+this.eng);
		System.out.println("���� ����:"+this.math);
		
		

	}

}
