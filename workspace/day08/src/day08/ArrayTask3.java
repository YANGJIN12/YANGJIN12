package day08;

import java.util.Scanner;

public class ArrayTask3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//����ڿ��� �迭�� ���̰� �Է�
		//���ڸ� �Է� �޴´�
		//�ش� �迭�� �ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ�, �׿��� ���ڴ� �״�� ��Ƽ�
		//�迭�� ����� ���
		
		System.out.print("�迭�� ���� �Է�:");
		int num=sc.nextInt();
		
		
		char[] alpha = new char[num];
		
		for(int i=0;i<alpha.length;i++) {
			System.out.print("���� �Է�:");
			alpha[i]=sc.next().charAt(0);
			
		}
		String res = "{";
		
		for(int i=0;i<alpha.length;i++) {
			if(alpha[i]>="a"&&alpha<="z") {
				res +=(char)(alpha[i]-32)+"";
				
				
			}else if(alpha[i]>="A"&&alpha[i]<="Z" {
					res +=(char)(alpha[i]+32)+"";
					
				
			}else {
				res += alpha[i]+"";
			}
				
		}
		
		
		

	}

}
