package day08;

import java.util.Scanner;

public class ArrayTask3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//사용자에게 배열의 길이값 입력
		//문자를 입력 받는다
		//해당 배열에 소문자는 대문자로, 대문자는 소문자로, 그외의 문자는 그대로 담아서
		//배열의 모양대로 출력
		
		System.out.print("배열의 길이 입력:");
		int num=sc.nextInt();
		
		
		char[] alpha = new char[num];
		
		for(int i=0;i<alpha.length;i++) {
			System.out.print("문자 입력:");
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
