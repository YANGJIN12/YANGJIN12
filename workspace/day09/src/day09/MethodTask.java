package day09;

import java.util.Scanner;

public class MethodTask {
	
//	public static void printName(String name,int num) {
//		for(int i=0;i<num;i++) {
//			System.out.println(name);
//		}
//	
//	}
//	
//	public static String Adault(int age) {
//		String res;
//		
//		if(age >19) {
//			System.out.println("���� �Դϴ�.");
//			
//		}else {
//			System.out.println("�̼������Դϴ�.");
//			
//		}
//		
//		return res;
//	}
//	
//	
//	
//	
//	
//	public static void main(String[]args) {
//		//1.����ڿ��� �̸��� �ݺ�Ƚ���� �Է¹ް� �̸� ����ϴ� �޼ҵ� �����
//		//2.����ڿ��� ���̸� �Է� �ް� �������� �̼��������� �Ǻ��ϴ� �޼ҵ� �����
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.print("�̸� �Է�:");
//		String name =sc.next();
//		
//		System.out.print("�ݺ�Ƚ�� �Է�:");
//		int num = sc.nextInt();
//		
//		System.out.print("�̸� �Է�:");
//		int age = sc.nextInt();
//		MethodTask.Adault(age);
		
		//�迭�� �迭 ������� ����ϴ� �޼ҵ� �����
		
		
	public static int addNum(int[] ar) {
		System.out.print("{");
		for(int i =0;i<ar.length-1;i++) {
			System.out.print(ar[i]+",");
			System.out.print(ar[ar.length-1]+"}");
		}
		System.out.print(ar[ar.length-1]+"}");
		return 0;
		
		
		
			
		}
	
		
	public static boolean isAdult(int age) {
		if(age>19) {
			return age;
		}else {
			
		}
		
	}
	
	
	
	public static void main(String[]args) {
		
		int[] ar = {1,2,3,4,5};
		int[]ar1 = {10,20,30,40,50};
		
		MethodTask.addNum(ar);
	}	
		
	}
















