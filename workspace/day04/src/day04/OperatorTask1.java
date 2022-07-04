package day04;
import java.util.Scanner;

public class OperatorTask1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//사용자에게 나이를 입력받아서
		//성인이라면 성인입니다를 출력하고 아니라면 미성년자입니다 출력하기
		
//		
//			///Integer.parselInt();
//		System.out.print("나이를 입력:");
//		int age = sc.nextInt();
//		
//		System.out.println(age > 19? "성인입니다":"미성년자입니다");
		
		
		//사용자에게 두 정수를 입력받아서 둘중 더 큰 수를 출력하는 프로그램
		//입력
		//정수1입력:
		//정수2입력:
		
		//출력
		//둘중 더 큰 수는 00입니다.

		 
//		System.out.print("정수1 입력:");
//		int num1 = sc.nextInt();
//		System.out.print("정수2 입력:");
//		int num2 = sc.nextInt();
//		
//		System.out.printf("둘중 더 큰수는" + (num1>num2? num1:num2) + "입니다");
		


		//사용자에게 두 정수를 입력 받아서
		//두 수의 차(큰수 - 작은수) 출력하기
		
		//출력
		//두 수의 차는 00입니다
		
//		System.out.print("정수1 입력:");
//		int num1 = sc.nextInt();
//		System.out.print("정수2 입력:");
//		int num2 = sc.nextInt();
//		
////		System.out.println("두수의 차는" + (num1>num2? num1-num2: num1-num2) + "입니다.");
//		
//		int res= num1>num2? num1-num2: num1-num2;
//		System.out.println("두수의 차는"+ res + "입니다.");
//		
		
		
		//나이가 10이상 25이하라면 1000원, 나머지 아이는 무료인 놀이공원
		//나이를 입력받고 알맞은 금액을 출력하시오
		
		//나이입력
		
		//1000원입니다.
		//무료입니다.
		
		
//		System.out.print("나이를 입력:");
//		int age = sc.nextInt();
		
		
////		String  res = age >= 10 && age <=25? "1000원" : "무료";
//		 
////		System.out.println(res + "입니다.");
//	
//		
//		age < 9|| age > 25
//		
//		
//		String  res = age < 9|| age > 25? "1000원" : "무료";
//		
//		System.out.println(res + "입니다.");
//		
		
		
		//사용자에게 키와 나이를 입력 받아서
		//120cm 이상, 8살 이상이라면 탑승가능, 아니면 탑승 불가능 출력
		
		
//		System.out.print("키 입력:");
//		int s = sc.nextInt();
//		System.out.print("나이 입력:");
//		int age = sc.nextInt();
		
//		String res = (s>=120 && age>=8)? "탑승가능":"탑승 불가능";
//		
//		System.out.print(res);
		
		
		
//		String res = (s<=120 && age<=8)? "탑승가능":"탑승 불가능";
//		
//		System.out.print(res);
		
//		String res = s <120 || age > 8? "탑승가능" : "탑승 불가능";
//		System.out.print(res + "입니다.");
		

		
		//한 박스당 20개의 라면이 들어가는 상자
		// 사용자에게 라면의 개수를 입력받아
		//필요한 상자의 갯수를 출력
		
		//총 00개의 상자가 필요합니다
		
		//사용자에게 이름을 입력
		//만약에 '관리자'가 입력이 되면 관리자 모드로 전환, 아니면 000님 환영합니다. 출력
		
		
		
//		System.out.print("라면 갯수:");
//		int a = sc.nextInt();
//		
//		int b = (a%20)==0?a / 20:a / 20+1;
//		//boxCnt
//		
//
//		System.out.print("총"+ b + "개의 상자가 필요합니다.");
		
		
//		System.out.print("이름 입력:");
//		String name = sc.nextLine();
//		
//		String res = name.equals("관리자")?"관리자 모드로 전환합니다.": name + "님 환영합니다.";
//		
//		System.out.println(res);
		
		
		
		
		
		
		
		//사용자에게 두 정수를 입력받아서 둘중 더 큰 수를 출력하는 프로그램
		//만약 같다면 "같다" 출력하기
				//입력
				//정수1입력:
				//정수2입력:
				
				//출력
				//둘중 더 큰 수는 00입니다.

		
		
		
		
		
		
		
		System.out.print("정수1 입력:");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력:");
		int num2 = sc.nextInt();
		
		String res = num1 > num2? num1+ "": num1 ==num2?"같다": num2 +"";
		System.out.println("결과: " + res);

		
		System.out.print("둘중 더 큰수는" + (num1>num2? num1:num2) + "입니다");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
