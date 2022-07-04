package day09;

import java.util.Scanner;

public class Review {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		//학생 성적 입출력 프로그램
		//1.학생성적 입력(4명)(국어,수학,영어)
		//2.학생 성적보기, 평균
		//3.종료
		
		System.out.println("학생 성적 입출력 프로그램");
		
		int[][] scores = new int[4][3];//점수를 저장할 배열
		String[] subjects = {"국어","수학","영어"};
		
		//{100,100,100}
		//{80,90,90}
		//{50,80,40}
		//{70,70,70}
		
		while(true) {
			System.out.println("1.학생 성적 입력하기");
			System.out.println("2.학생 성적 보기");
			System.out.println("3.종료하기");
			
			System.out.print("메뉴 선택:");
			int choice = Integer.parseInt(sc.nextLine());
			
			if(choice ==1) {
				for(int i=0;i<scores.length;i++) {
					System.out.println((i+1)+"번째 학생 성적 입력");
					
					for(int j=0;j<scores[i].length;j++) {//과목당 성적 입력
						System.out.print(subjects[j]+"과목 점수 입력:");
					scores[i][j]=Integer.parseInt(sc.nextLine());
						
						
					}
					System.out.println("--------------------------");
					
					}
				
				
				
				
			}else if(choice==2) {
				//몇번 학생의 평균점수
				System.out.println("학생 번호 입력:");
				int studentNum = Integer.parseInt(sc.nextLine());
				
				int total = 0;
				for(int i=0;i<scores[studentNum-1].length;i++) {
					total += scores[studentNum-1][i];
					
				}
				System.out.println(studentNum+"번째 학생의 평균 점수는"+scores+"입니다");
				
				
				
				
				
			}else if(choice==3) {
				System.out.println("프로그램을 종료합니다.");
				break;
				
				
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
			
			
			
			
		}//while문
		
		
	}

}
