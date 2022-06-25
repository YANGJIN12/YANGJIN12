package game;

public class Animals {
	
	String name; // ĳ���� �̸� 
	int hp;		// ĳ������ ���� ü�� 
	int feed;	// ���� ���� ���� 
	
	public Animals(String name, int hp, int feed) {
		super();
		this.name = name;
		this.hp = hp;
		this.feed = feed;
	}
	
	private void show() {
		
		System.out.println(this.name + " �� ���� ü�� : " + this.hp);
		System.out.println(this.name + " �� ���� ���̰��� : " + this.feed);
		
	}
	
	//�����ֱ�
	public void eat() {
		this.hp++;
		this.feed--;
		this.show();
	}
	
	//��å�ϱ� 
	public void walk() {
		hp--;
		feed++;
		show();
		
	}
	
	//����ֱ�
	public void play() {
		this.hp +=20;
		this.feed += 20;
		this.show();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
