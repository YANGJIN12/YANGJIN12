package Car;

public class Main {
	public static void main(String[]args) {
		
		//�ʱ�ȭ ������
	Car momCar = new Car("ȫ�浿","black",1000);
		System.out.println(momCar.name);
		System.out.println(momCar.meney);	
		System.out.println(momCar.color);
	
		
		momCar.powerOn();
		momCar.goForward();
			
	}
}


