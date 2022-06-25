package game;

public class Hams extends Animals{

	public Hams(String name, int hp, int feed) {
		super(name, hp, feed);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		this.hp +=4;
		super.eat();
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		this.hp -=4;
		super.walk();
	}

	@Override
	public void play() {
		
		System.out.println(this.name +"�̶� ����� ");
		for (int i = 0; i < 10; i++) {
			
			System.out.print("����~!~!");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		}
		
		System.out.println();
		
		super.play();
	}
	


	
	
	
	
	
	
	
	
	
}
