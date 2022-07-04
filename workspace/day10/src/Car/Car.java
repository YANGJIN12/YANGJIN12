package Car;

public class Car {
	
	String name;
	int meney;
	String color;
	
		public Car(String name,int meney,String color) {
	    this.name=name;
		this.meney=meney;
		this.color=color;
		
		
		
		
	}
	
public void powerOn() {
	System.out.println("시동을 켭니다.");
}

public void goForward() {
	System.out.println("앞으로 갑니다.");
}
	
	//차주이름,가격,색깔
	//시동을 켜는기능,앞으로 가는기능
	//출력만 시동을 켭니다,앞으로 갑니다.

}
