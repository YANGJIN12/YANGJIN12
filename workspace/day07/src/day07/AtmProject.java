package day07;

import java.util.Scanner;
import java.util.Random;


public class AtmProject {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		
		int adcode=1234;
		String Account ="";
		int Pw =0;
	
		int wallet =0;
		
		
		
		while(true) {
			//1.계좌 발급
			System.out.print("메뉴 선택:");
			int choice=sc.nextInt();
			
			
			if(choice==1){
				//String 클래스 안에있는 format();, 사용법은 printf 랑 똑같다, 메소드의 사용결과가 String의 값(형식이 지정된 값)
				 Account = String.format("%02d-%04d-%04d",r.nextInt(100),r.nextInt(10000),r.nextInt(10000));
				 System.out.println("발급된 계좌번호:"+Account);
				 int CheckPw = 0;
				 for(int i=0;i<3;i++) {
					 //비밀번호 설정
					 //3회이상 틀리면 첫화면으로
					 System.out.print("비밀번호 입력:");
					 Pw=sc.nextInt();
					 sc.nextLine();
					 	
					 
					 System.out.print("비밀번호 확인:");
					 CheckPw=sc.nextInt();
					 sc.nextLine();
					 
					 
					 
					 if(Pw=0||Pw<9999||Pw<0) {
						 System.out.println("비밀번호가 0000으로는 설정할수 없습니다.");
						 
					 
					 if(Pw==CheckPw) {
						 System.out.println("계좌 개설 완료");
						 break;
					 }
						 System.out.println("비밀번호가 일치하지 않습니다.");
						 if(i==2) {
							 System.out.println("비밀번호 3회 이상 오류로 메인메뉴로 돌아갑니다.");
							 Account="";
							 break;
						 
						 
						 
						 }
					 
					 
					 	 
				
				 }else if(choice==2){
				//2.입금하기
				if(Account.equals("")) {
					System.out.println("계좌가 발급되지 않았습니다.\n계좌를 개설 해주세요.");
					continue;
					
				}
				System.out.println("계좌번호 입력:");
				sc.nextLine();
				String AccountCheck=sc.nextLine();
				
				if(Account.equals(AccountCheck)) {
					for(int i=0;i<3;i++) {
						int CheckPw=sc.nextInt();
						
						if(Pw==CheckPw) {
							//금액추가 부분
							System.out.println("금액 입력:");
							int moneyln=sc.nextInt();
							wallet+=moneyln;
							System.out.println("현재 통장 잔고:"+wallet);
							break;//for문 탈출
						
						
						}
						
						
						
						System.out.println("비밀번호가 잘못 되었습니다.");
						if(i==2) {
							System.out.println("비밀번호 3회 이상 오류로 메인메뉴로 돌아갑니다.");
							continue;
							
						}
					}//비밀번호 확인 반복문
					
				}else {
					System.out.println("계좌번호를 잘못 입력하셨습니다.");
				
				
				
				
				
				
				}
				
				
			
			
			
			
			
			
			
			
			
			}else if(choice==3) {
				//3.출금하기
				if(Account.equals("")) {
					System.out.println("계좌가 발급되지 않았습니다.\n계좌를 개설 해주세요.");
					continue;
					
				}
				String AccountChek=sc.nextLine();
				
				if(Account.equals(AccountChek)) {
					for(int i=0;i<3;i++) {
						System.out.print("비밀번호 입력:");
						CheckPw=sc.nextInt();
						
						
							
						}
					}
					System.out.println("비밀번호가 잘못되었습니다.");
					if(i==2) {
						System.out.println("비밀번호 3회 이상 오류로 메인메뉴로 돌아갑니다.");
						continue;
						
					}
				}
				System.out.println("계좌번호가 일치하지 않습니다.");
				continue;
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			}else if(choice==4) {
				//4.나가기
				System.out.print("관리자 코드:");
				int code = sc.nextInt();
				if(code==adcode) {
					System.out.println("프로그램을 종료합니다.");
					break;
					
					
				}else{
					System.out.println("관리자 코드가 일치하지 않습니다.");
					continue;
				}
			
			
			
			
			
			
			
			
			
			
			
			
			
			}else{
				//while문 닫는 괄호
			System.out.println("잘못 입력하셨습니다.");
			continue;
			
			
			
			
			
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
	}

}
