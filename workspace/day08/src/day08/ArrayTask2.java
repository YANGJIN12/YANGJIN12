package day08;

import java.util.Scanner;


public class ArrayTask2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			
		
		//����ڿ��� �Է¹��� ������ ������ �Է¹���
		//����ڿ��� �ش� ������ŭ ���� �Է¹ޱ�(�迭���� ���� ��Ƽ�)
		//�ش� �迭 �ӿ��� �ִ� ����ϱ�
		//�ش� �迭 �ӿ��� �ּڰ� ����ϱ�
		
		System.out.print("�迭�� ���� �Է�:");
		int num=sc.nextInt();
		
		int[]array = new int[num];
		 
		for(int i=0;i<array.length;i++) {
			System.out.print("���� �Է�:");
			array[i]=sc.nextInt();
			
		}
		System.out.print("{");
		for(int i=0;i<array.length-1;i++) {
			System.out.print(array[i]+",");
			
		}
		System.out.print(array[num-1]+"}");
	
	
		
		
		 int max= array[0];
		 
		 for(int i=1;i<array.length;i++) {
			 if(array[i]>max){
				 max = array[i];
				 
			 }
		 }
			System.out.println("�ִ�:"+max);
			
		
		int min= array[0];
		
		for(int i=1;i<array.length;i++) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		System.out.print("�ּڰ�:"+min);
		
	
	
	}
	
	
	
	
	
}
		
		
		

	


