package day06;

import java.util.Random;
import java.util.Scanner;
public class UpAndDown {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		
	//컴퓨터가 숫자를 하나 랜덤하게 받아옴
	//사용자가 그 숫자를 맞추는 게임
	//사용자가 입력한 숫자가 랜덤한 숫자보다 작다면 Up
	//크다면 Down
	//같다면 
	//축하합니다 00번 만에 정답을 맞추셨습니다.~
		
		
		int i,num,randNum;
		
		randNum = r.nextInt(1,100);
		i = 0;
		
		while(true) {
			System.out.print("정수 입력:");
			
			num = sc.nextInt();
			
			if(num>randNum) {
				System.out.println("Down");
			
			}else if(num<randNum) {
				System.out.println("Up");
			}else {
				break;
			}
			i++;
		}
		
		System.out.println("축하합니다. 정답을 맞추셨습니다.");
		
			
			
			
			
			
			
			
		}
		

	}


