package day08;

import java.util.Scanner;

public class ArrayTask1 {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	//����ڿ��� ����,����,���� ������ �Է¹޾�(���� �迭�� ��Ƽ�)
	//������ ��� ���
	
	int[]scores =new int[3];
	int sum = 0;
	String[] sub = {"����","����","����"};
	
	
	for(int i=0;i<scores.length;i++) {
		System.out.print("���� �Է�:");
		scores[i]=sc.nextInt();
		sum +=scores[i];
	
	}
	System.out.println("����:"+sum+"��");
	System.out.println("���:"+sum/scores.length+"��");
	
	
	
	
	
	

	
		
	
	
	
	
	
	}

}
