package day08;

import java.util.Scanner;


public class ArrayTask2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			
		
		//사용자에게 입력받을 정수의 개수를 입력받음
		//사용자에게 해당 개수만큼 정수 입력받기(배열에다 값을 담아서)
		//해당 배열 속에서 최댓값 출력하기
		//해당 배열 속에서 최솟값 출력하기
		
		System.out.print("배열의 길이 입력:");
		int num=sc.nextInt();
		
		int[]array = new int[num];
		 
		for(int i=0;i<array.length;i++) {
			System.out.print("정수 입력:");
			array[i]=sc.nextInt();
			
		}
		System.out.print("{");
		for(int i=0;i<array.length-1;i++) {
			System.out.print(array[i]+",");
			
		}
		System.out.print(array[num-1]+"}");
	
	
		
		
		 int max= array[0];
		 
		 for(int i=1;i<array.length;i++) {
			 if(array[i]>max){
				 max = array[i];
				 
			 }
		 }
			System.out.println("최댓값:"+max);
			
		
		int min= array[0];
		
		for(int i=1;i<array.length;i++) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		System.out.print("최솟값:"+min);
		
	
	
	}
	
	
	
	
	
}
		
		
		

	


