package day09;

import java.util.Scanner;

public class Review {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		//�л� ���� ����� ���α׷�
		//1.�л����� �Է�(4��)(����,����,����)
		//2.�л� ��������, ���
		//3.����
		
		System.out.println("�л� ���� ����� ���α׷�");
		
		int[][] scores = new int[4][3];//������ ������ �迭
		String[] subjects = {"����","����","����"};
		
		//{100,100,100}
		//{80,90,90}
		//{50,80,40}
		//{70,70,70}
		
		while(true) {
			System.out.println("1.�л� ���� �Է��ϱ�");
			System.out.println("2.�л� ���� ����");
			System.out.println("3.�����ϱ�");
			
			System.out.print("�޴� ����:");
			int choice = Integer.parseInt(sc.nextLine());
			
			if(choice ==1) {
				for(int i=0;i<scores.length;i++) {
					System.out.println((i+1)+"��° �л� ���� �Է�");
					
					for(int j=0;j<scores[i].length;j++) {//����� ���� �Է�
						System.out.print(subjects[j]+"���� ���� �Է�:");
					scores[i][j]=Integer.parseInt(sc.nextLine());
						
						
					}
					System.out.println("--------------------------");
					
					}
				
				
				
				
			}else if(choice==2) {
				//��� �л��� �������
				System.out.println("�л� ��ȣ �Է�:");
				int studentNum = Integer.parseInt(sc.nextLine());
				
				int total = 0;
				for(int i=0;i<scores[studentNum-1].length;i++) {
					total += scores[studentNum-1][i];
					
				}
				System.out.println(studentNum+"��° �л��� ��� ������"+scores+"�Դϴ�");
				
				
				
				
				
			}else if(choice==3) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
				
				
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			
			
			
			
			
		}//while��
		
		
	}

}
