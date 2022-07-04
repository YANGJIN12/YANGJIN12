package day08;

import java.util.Scanner;

public class ArrayTask1 {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	//사용자에게 국어,영어,수학 점수를 입력받아(값에 배열에 담아서)
	//총점과 평균 출력
	
	int[]scores =new int[3];
	int sum = 0;
	String[] sub = {"국어","수학","영어"};
	
	
	for(int i=0;i<scores.length;i++) {
		System.out.print("점수 입력:");
		scores[i]=sc.nextInt();
		sum +=scores[i];
	
	}
	System.out.println("총합:"+sum+"점");
	System.out.println("평균:"+sum/scores.length+"점");
	
	
	
	
	
	

	
		
	
	
	
	
	
	}

}
