package game;

public class Cat extends Animals{

	public Cat(String name, int hp, int feed) {
		super(name, hp, feed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		
		hp +=2;
		feed -=2;
		super.eat();
		
	}

	@Override
	public void play() {
		System.out.println(this.name + "���� ��");
	
		for (int i = 0; i < 3; i++) {
			System.out.print("�߿�~!");
			
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
	
	// �ڽĿ��� ���Ӱ� ���� �޼ҵ�
	public void onlyCat() {
		
		System.out.println("�߿˾߿�~!~!");
		
	}
	
	
	
	
	
	
	
	
	
}
