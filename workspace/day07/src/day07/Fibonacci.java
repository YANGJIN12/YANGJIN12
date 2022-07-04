package day07;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//반복문을 사용해서 피보나치 수열 구현
		//사용자에게 정수를 입력 받아서 해당 항까지의 피보나치수열 출력
		System.out.print("정수를 입력:");
		
		
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
