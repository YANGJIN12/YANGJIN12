package ATM;

import java.util.Scanner;
import java.util.Random;


public class AtmTest {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int adcode = 1234;
		String Account = "";
		String Pw = "";
		int Balance = 0;
		
		System.out.println("----ATM��⸦ �����ϰڽ��ϴ�----");
		
		
		while(true){
			System.out.println("--���� �޴�--");
			System.out.println("1.���� ����");
			System.out.println("2.�Ա�");
			System.out.println("3.���");
			System.out.println("4.����");
			System.out.print("������ �޴� �Է�:");
			
			int choice = Integer.parseInt(sc.nextLine());
			
			
			
		if(choice ==1) {
			
			for(int i=0;i<3;i++) {
				Account = String.format("%02d-%04d-%04d",r.nextInt(100),r.nextInt(10000),r.nextInt(10000));
				System.out.println("�߱� ����:"+Account);
				System.out.print("������ ���º�й�ȣ �Է�:");
				Pw = sc.nextLine();
				System.out.print("��й�ȣ Ȯ��:");
				String choicePw = sc.nextLine();
				
			
				if(Pw.equals(choicePw)){
					System.out.println("0000"+"�� ��й�ȣ�� �����ϽǼ� �����ϴ�.");
					continue;
					
					
				
				}
				if (Pw.equals(choicePw)) {
					System.out.println("��й�ȣ�� ���� �Ǿ����ϴ�.");
					break;
					
				}else {
					 {
					 }if(i==2) {
						System.out.println("��й�ȣ Ƚ�� �ʰ� >> ���θ޴��� �̵��մϴ�.");
						break;
				
					}
					
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. ������ȸ :"+(2-i)+"ȸ");
				}
			}
					
					
				
			
					
			
		}else if(choice == 2 ) {
			if(Account.equals("")){
				System.out.println("���¸� ���� �߱��ϼ���.");
				continue;
				}
			System.out.println("�Ա��� ���� �Է�:");
			String inputAccount = sc.nextLine();
			
			if(Account.equals(inputAccount)) {
				for(int i=0;i<3;i++) {
					System.out.print("��й�ȣ �Է�:");
					String inputPw = sc.nextLine();
					System.out.print("��й�ȣ Ȯ��:");
					String choicePw = sc.nextLine();
					if(Pw.equals(inputPw)) {
						System.out.println("�Ա� �ݾ� �Է�:");
						int money = Integer.parseInt(sc.nextLine());
						Balance += money;
						System.out.println(money + "���� ���������� �ԱݵǾ����ϴ�.");
						System.out.println("���� ���� �ܾ�:"+Balance+"��");
						break;
						
					}else {
						if(i==2) {
							System.out.println("��й�ȣ Ƚ�� �ʰ� >> ���θ޴��� �̵��մϴ�.");
							break;
							
						}
						System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. ������ȸ :"+(2-i)+"ȸ");
					}
				}
					}else {
						System.out.println("�ش� ���°� �����ϴ�.");
						
						
					
					
					
					
					}
					
					
					
					
			}else if(choice ==3) {
					if(Account.equals("")){
						System.out.println("���¸� ���� �߱��ϼ���.");
						continue;
						}
					
					System.out.print("���� ��ȣ �Է�:");
					String inputAccount = sc.nextLine();
					
					if(Account.equals(inputAccount)) {
						for(int i=0;i<3;i++) {
							System.out.println("��й�ȣ �Է�:");
							String inputPw = sc.nextLine();
							System.out.print("��й�ȣ Ȯ��:");
							String choicePw = sc.nextLine();
							if(Pw.equals(inputPw)) {
								System.out.println("��� �ݾ� �Է�:");
								int money = Integer.parseInt(sc.nextLine());
								if(money <= Balance) {
									Balance -= money;
									System.out.println("��� ����!,���� �ܾ�:"+Balance+"��");
									break;
								
								}
								
								System.out.println("���� �ܾ��� �����մϴ�.�ܾ�:"+Balance+"��");
								break;
							}else {
								if(i==2) {
									System.out.println("��й�ȣ Ƚ�� �ʰ� >> ���θ޴��� �̵��մϴ�.");
									break;
									
								}
								System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. ������ȸ :"+(2-i)+"ȸ");
							}
						}
							}else {
								System.out.println("�ش� ���°� �����ϴ�.");
								
								
						}
						
					
					
			
			
			
			
			
			
			
			
			
			
			}else if(choice ==4) {
				for(int i=0;i<3;i++) {
				System.out.print("�������ڵ� �Է�:");
				int code = sc.nextInt();
				if(code==adcode) {
					System.out.println("��⸦ �����մϴ�.");
					break;
					
				}else {
					System.out.println("�߸� �Է��߽��ϴ�! �ٽ� �Է��ϼ���.");
					System.out.println();
				}
				}
				
				
				
				
			}
				
				
				
				
		}	
	
	}

}
