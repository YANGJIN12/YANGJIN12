package day06;

import java.util.Scanner;
public class WhileTest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int i=0;
		while(i<3) {
			System.out.println("hello 안쪽 i:"+i);
			i++;
		}
		
		for(int j=0;j<3;j++) {
			System.out.println("for j:"+j);
		}
			System.out.println("while 문 바깥문장");
	}

}
