package day07;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//�ݺ����� ����ؼ� �Ǻ���ġ ���� ����
		//����ڿ��� ������ �Է� �޾Ƽ� �ش� �ױ����� �Ǻ���ġ���� ���
		System.out.print("������ �Է�:");
		
		
		int f1=0;
		int f2=1;
		int f3;
		int num=sc.nextInt();
		if(num==1) {
			System.out.println("0");
			
		}
		
		
		if(num>=2) {
			System.out.print("0 1");
			
			for(int i=0;i<num-2;i++);
				f3=f1+f2;
				System.out.print(""+f3);
				
				
			for(int i=0;i<num-2;i++);
				
				f1=f2;
				f2=f3;
		}
		for(int i=0;i<num;i++) {
			System.out.print(""+(f1));
			
		}
		
		
		
		
	}

}
