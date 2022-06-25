package game;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Animals avatar = null;
		
		System.out.println("---�𿩶� ���� ģ����---");
		
		while(true) {
			System.out.println("--ĳ���� ����--");
			System.out.println("1. ������");
			System.out.println("2. ������");
			System.out.println("3. �ܽ��� ");
			
			System.out.print("�Է� >> ");
			int choice = Integer.parseInt(sc.nextLine());
			
			if(choice != 1 && choice != 2 && choice != 3) {
				
				System.out.println("�˸��� ĳ���͸� �����ϼ��� ");
				continue;
				
			}
			
			System.out.print("ĳ���� �̸� ���� >>");
			String name = sc.nextLine();
			
			if(choice == 1) {
				//������ ĳ����
				avatar = new Dog(name,50,50);
				
			}else if(choice ==2) {
				//������ ĳ����
				avatar = new Cat(name, 100,15);
				
			}else if(choice == 3) {
				//�ܽ��� ĳ���� 
				avatar = new Hams(name, 20,10);
			}
			
			break;
		
		}
		
		
		while(true) {
			
			System.out.println("1. �����ֱ� ");
			System.out.println("2. ��å���� ");
			System.out.println("3. ����ֱ� ");
			System.out.println("4. �����ϱ� ");
			
			System.out.print("�Է� >>");
			int choice = Integer.parseInt(sc.nextLine());
			
			
			if(choice ==1 ) {
				avatar.eat();

			}else if(choice == 2) {
				avatar.walk();
				
			}else if(choice ==3) {
				avatar.play();
				
			}else if(choice == 4) {
				System.out.println("������ �����մϴ�");
				// avatar�� cat Ÿ���� ��쿡�� ~ �߿�~
				if(avatar instanceof Cat) {
					((Cat)avatar).onlyCat();
				}
				
				break;
			}else {
				System.out.println("�ٽ� �Է��Ͻÿ� ");
				
			}
			

			
		}
		
		
		
		
		
		
	}
}
