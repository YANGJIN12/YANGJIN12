package day07;

import java.util.Scanner;
import java.util.Random;


public class AtmProject {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		
		int adcode=1234;
		String Account ="";
		int Pw =0;
	
		int wallet =0;
		
		
		
		while(true) {
			//1.���� �߱�
			System.out.print("�޴� ����:");
			int choice=sc.nextInt();
			
			
			if(choice==1){
				//String Ŭ���� �ȿ��ִ� format();, ������ printf �� �Ȱ���, �޼ҵ��� ������� String�� ��(������ ������ ��)
				 Account = String.format("%02d-%04d-%04d",r.nextInt(100),r.nextInt(10000),r.nextInt(10000));
				 System.out.println("�߱޵� ���¹�ȣ:"+Account);
				 int CheckPw = 0;
				 for(int i=0;i<3;i++) {
					 //��й�ȣ ����
					 //3ȸ�̻� Ʋ���� ùȭ������
					 System.out.print("��й�ȣ �Է�:");
					 Pw=sc.nextInt();
					 sc.nextLine();
					 	
					 
					 System.out.print("��й�ȣ Ȯ��:");
					 CheckPw=sc.nextInt();
					 sc.nextLine();
					 
					 
					 
					 if(Pw=0||Pw<9999||Pw<0) {
						 System.out.println("��й�ȣ�� 0000���δ� �����Ҽ� �����ϴ�.");
						 
					 
					 if(Pw==CheckPw) {
						 System.out.println("���� ���� �Ϸ�");
						 break;
					 }
						 System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
						 if(i==2) {
							 System.out.println("��й�ȣ 3ȸ �̻� ������ ���θ޴��� ���ư��ϴ�.");
							 Account="";
							 break;
						 
						 
						 
						 }
					 
					 
					 	 
				
				 }else if(choice==2){
				//2.�Ա��ϱ�
				if(Account.equals("")) {
					System.out.println("���°� �߱޵��� �ʾҽ��ϴ�.\n���¸� ���� ���ּ���.");
					continue;
					
				}
				System.out.println("���¹�ȣ �Է�:");
				sc.nextLine();
				String AccountCheck=sc.nextLine();
				
				if(Account.equals(AccountCheck)) {
					for(int i=0;i<3;i++) {
						int CheckPw=sc.nextInt();
						
						if(Pw==CheckPw) {
							//�ݾ��߰� �κ�
							System.out.println("�ݾ� �Է�:");
							int moneyln=sc.nextInt();
							wallet+=moneyln;
							System.out.println("���� ���� �ܰ�:"+wallet);
							break;//for�� Ż��
						
						
						}
						
						
						
						System.out.println("��й�ȣ�� �߸� �Ǿ����ϴ�.");
						if(i==2) {
							System.out.println("��й�ȣ 3ȸ �̻� ������ ���θ޴��� ���ư��ϴ�.");
							continue;
							
						}
					}//��й�ȣ Ȯ�� �ݺ���
					
				}else {
					System.out.println("���¹�ȣ�� �߸� �Է��ϼ̽��ϴ�.");
				
				
				
				
				
				
				}
				
				
			
			
			
			
			
			
			
			
			
			}else if(choice==3) {
				//3.����ϱ�
				if(Account.equals("")) {
					System.out.println("���°� �߱޵��� �ʾҽ��ϴ�.\n���¸� ���� ���ּ���.");
					continue;
					
				}
				String AccountChek=sc.nextLine();
				
				if(Account.equals(AccountChek)) {
					for(int i=0;i<3;i++) {
						System.out.print("��й�ȣ �Է�:");
						CheckPw=sc.nextInt();
						
						
							
						}
					}
					System.out.println("��й�ȣ�� �߸��Ǿ����ϴ�.");
					if(i==2) {
						System.out.println("��й�ȣ 3ȸ �̻� ������ ���θ޴��� ���ư��ϴ�.");
						continue;
						
					}
				}
				System.out.println("���¹�ȣ�� ��ġ���� �ʽ��ϴ�.");
				continue;
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			}else if(choice==4) {
				//4.������
				System.out.print("������ �ڵ�:");
				int code = sc.nextInt();
				if(code==adcode) {
					System.out.println("���α׷��� �����մϴ�.");
					break;
					
					
				}else{
					System.out.println("������ �ڵ尡 ��ġ���� �ʽ��ϴ�.");
					continue;
				}
			
			
			
			
			
			
			
			
			
			
			
			
			
			}else{
				//while�� �ݴ� ��ȣ
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			continue;
			
			
			
			
			
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
	}

}
