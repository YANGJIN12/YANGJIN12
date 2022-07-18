package ATM;

import java.util.Scanner;
import java.util.Random;


public class AtmTest {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int adcode = 1234;
		String Account = "";
		String Pw = "";
		int Balance = 0;
		
		System.out.println("----ATM기기를 실행하겠습니다----");
		
		
		while(true){
			System.out.println("--메인 메뉴--");
			System.out.println("1.계좌 개설");
			System.out.println("2.입금");
			System.out.println("3.출금");
			System.out.println("4.종료");
			System.out.print("선택할 메뉴 입력:");
			
			int choice = Integer.parseInt(sc.nextLine());
			
			
			
		if(choice ==1) {
			
			for(int i=0;i<3;i++) {
				Account = String.format("%02d-%04d-%04d",r.nextInt(100),r.nextInt(10000),r.nextInt(10000));
				System.out.println("발급 계좌:"+Account);
				System.out.print("설정할 계좌비밀번호 입력:");
				Pw = sc.nextLine();
				System.out.print("비밀번호 확인:");
				String choicePw = sc.nextLine();
				
			
				if(Pw.equals(choicePw)){
					System.out.println("0000"+"은 비밀번호로 설정하실수 없습니다.");
					continue;
					
					
				
				}
				if (Pw.equals(choicePw)) {
					System.out.println("비밀번호가 설정 되었습니다.");
					break;
					
				}else {
					 {
					 }if(i==2) {
						System.out.println("비밀번호 횟수 초과 >> 메인메뉴로 이동합니다.");
						break;
				
					}
					
					System.out.println("비밀번호가 일치하지 않습니다. 남은기회 :"+(2-i)+"회");
				}
			}
					
					
				
			
					
			
		}else if(choice == 2 ) {
			if(Account.equals("")){
				System.out.println("계좌를 먼저 발급하세요.");
				continue;
				}
			System.out.println("입금할 계좌 입력:");
			String inputAccount = sc.nextLine();
			
			if(Account.equals(inputAccount)) {
				for(int i=0;i<3;i++) {
					System.out.print("비밀번호 입력:");
					String inputPw = sc.nextLine();
					System.out.print("비밀번호 확인:");
					String choicePw = sc.nextLine();
					if(Pw.equals(inputPw)) {
						System.out.println("입금 금액 입력:");
						int money = Integer.parseInt(sc.nextLine());
						Balance += money;
						System.out.println(money + "원이 정상적으로 입금되었습니다.");
						System.out.println("현재 통장 잔액:"+Balance+"원");
						break;
						
					}else {
						if(i==2) {
							System.out.println("비밀번호 횟수 초과 >> 메인메뉴로 이동합니다.");
							break;
							
						}
						System.out.println("비밀번호가 일치하지 않습니다. 남은기회 :"+(2-i)+"회");
					}
				}
					}else {
						System.out.println("해당 계좌가 없습니다.");
						
						
					
					
					
					
					}
					
					
					
					
			}else if(choice ==3) {
					if(Account.equals("")){
						System.out.println("계좌를 먼저 발급하세요.");
						continue;
						}
					
					System.out.print("계좌 번호 입력:");
					String inputAccount = sc.nextLine();
					
					if(Account.equals(inputAccount)) {
						for(int i=0;i<3;i++) {
							System.out.println("비밀번호 입력:");
							String inputPw = sc.nextLine();
							System.out.print("비밀번호 확인:");
							String choicePw = sc.nextLine();
							if(Pw.equals(inputPw)) {
								System.out.println("출금 금액 입력:");
								int money = Integer.parseInt(sc.nextLine());
								if(money <= Balance) {
									Balance -= money;
									System.out.println("출금 성공!,현재 잔액:"+Balance+"원");
									break;
								
								}
								
								System.out.println("통장 잔액이 부족합니다.잔액:"+Balance+"원");
								break;
							}else {
								if(i==2) {
									System.out.println("비밀번호 횟수 초과 >> 메인메뉴로 이동합니다.");
									break;
									
								}
								System.out.println("비밀번호가 일치하지 않습니다. 남은기회 :"+(2-i)+"회");
							}
						}
							}else {
								System.out.println("해당 계좌가 없습니다.");
								
								
						}
						
					
					
			
			
			
			
			
			
			
			
			
			
			}else if(choice ==4) {
				for(int i=0;i<3;i++) {
				System.out.print("관리자코드 입력:");
				int code = sc.nextInt();
				if(code==adcode) {
					System.out.println("기기를 종료합니다.");
					break;
					
				}else {
					System.out.println("잘못 입력했습니다! 다시 입력하세요.");
					System.out.println();
				}
				}
				
				
				
				
			}
				
				
				
				
		}	
	
	}

}
