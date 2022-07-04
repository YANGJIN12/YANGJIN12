package Car;

public class Main {
	public static void main(String[]args) {
		
		//초기화 생성자
	Car momCar = new Car("홍길동","black",1000);
		System.out.println(momCar.name);
		System.out.println(momCar.meney);	
		System.out.println(momCar.color);
	
		
		momCar.powerOn();
		momCar.goForward();
			
	}
}


