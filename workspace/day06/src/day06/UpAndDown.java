package day06;

import java.util.Random;
import java.util.Scanner;
public class UpAndDown {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		
	//��ǻ�Ͱ� ���ڸ� �ϳ� �����ϰ� �޾ƿ�
	//����ڰ� �� ���ڸ� ���ߴ� ����
	//����ڰ� �Է��� ���ڰ� ������ ���ں��� �۴ٸ� Up
	//ũ�ٸ� Down
	//���ٸ� 
	//�����մϴ� 00�� ���� ������ ���߼̽��ϴ�.~
		
		
		int i,num,randNum;
		
		randNum = r.nextInt(1,100);
		i = 0;
		
		while(true) {
			System.out.print("���� �Է�:");
			
			num = sc.nextInt();
			
			if(num>randNum) {
				System.out.println("Down");
			
			}else if(num<randNum) {
				System.out.println("Up");
			}else {
				break;
			}
			i++;
		}
		
		System.out.println("�����մϴ�. ������ ���߼̽��ϴ�.");
		
			
			
			
			
			
			
			
		}
		

	}


