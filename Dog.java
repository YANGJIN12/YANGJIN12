package game;

public class Dog extends Animals{

	public Dog(String name, int hp, int feed) {
		super(name, hp, feed);
		// TODO Auto-generated constructor stub
	}
	
//	public Dog(String name, int hp, int feed) {
//		super(name, hp, feed);
//		
//	}
	
	@Override
	public void walk() {
		
		this.hp -= 2;
		super.walk();
		
//		this.hp -=3;
//		this.feed++;
//		this.show();
		
	}
	
	//����ֱ�
	@Override
	public void play() {
		
		System.out.println(this.name + "�̶� ��� �� !!");
		
		for (int i = 0; i < 10; i++) {
			
			System.out.print("~");
		
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
		
				e.printStackTrace();
			}

		}
		super.play();
	}
	
	

	
	
	
	
}
