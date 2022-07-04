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
//			System.out.println("성인 입니다.");
//			
//		}else {
//			System.out.println("미성년자입니다.");
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
//		//1.사용자에게 이름과 반복횟수를 입력받고 이를 출력하는 메소드 만들기
//		//2.사용자에게 나이를 입력 받고 성인인지 미성년자인지 판별하는 메소드 만들기
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.print("이름 입력:");
//		String name =sc.next();
//		
//		System.out.print("반복횟수 입력:");
//		int num = sc.nextInt();
//		
//		System.out.print("이름 입력:");
//		int age = sc.nextInt();
//		MethodTask.Adault(age);
		
		//배열을 배열 모양으로 출력하는 메소드 만들기
		
		
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
















