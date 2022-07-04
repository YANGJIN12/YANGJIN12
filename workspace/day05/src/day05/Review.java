package day05;

import java.util.Scanner;

public class Review {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
	

//		
//		System.out.println("-----윤년 판단-----");
//		
//		System.out.print("년도 입력:");
//		int year = sc.nextInt();
//		
//		if(year % 4 ==0){
//			 if(year% 100 == 0){
//			
//			
//		
//			 }else {
//				 System.out.println("윤년");
//				 
//			 } 
//				 
//			 }else{
//				 System.out.println("평년");
//				 
//			 }else{
//				 System.out.println("윤년");
//			
//			 }else{
//			 System.out.println("평년");
//				 
//			 }
//		String res = year % 4 == 0? year % 100 ==0?year %400 == 0?
//				
//
//

		
		
		int hour,min,addmin;
		String day = null;
		
		
		
		
		
		System.out.print("시간 입력:");
		hour = sc.nextInt();
	
		System.out.print("분을 입력:");
		min = sc.nextInt();
		
		
		
		System.out.print("추가 분 입력:");
		addmin = sc.nextInt();
		
		
		if(hour <= 24) {
			
			if(min + addmin >= 60) {
				
				
				
				hour = hour + (min + addmin)/60;
				min = (min + addmin)%60;
				
				
				}else {
				min= min + addmin;
			
		
		
		
				}if(hour <12) {
					day = "오전";
				
				}else {
					day = "오후";
				}
				
				if(hour > 12) {
					hour = hour -12;
					
					System.out.println("입력 시간에" + addmin + "분을 추가 한 시간은"+day+hour+"시"+min+"분 입니다.");
					
				}
	
	
	
	
	
	

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
}
}
}