package day05;

import java.util.Scanner;

public class Review {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
	

//		
//		System.out.println("-----���� �Ǵ�-----");
//		
//		System.out.print("�⵵ �Է�:");
//		int year = sc.nextInt();
//		
//		if(year % 4 ==0){
//			 if(year% 100 == 0){
//			
//			
//		
//			 }else {
//				 System.out.println("����");
//				 
//			 } 
//				 
//			 }else{
//				 System.out.println("���");
//				 
//			 }else{
//				 System.out.println("����");
//			
//			 }else{
//			 System.out.println("���");
//				 
//			 }
//		String res = year % 4 == 0? year % 100 ==0?year %400 == 0?
//				
//
//

		
		
		int hour,min,addmin;
		String day = null;
		
		
		
		
		
		System.out.print("�ð� �Է�:");
		hour = sc.nextInt();
	
		System.out.print("���� �Է�:");
		min = sc.nextInt();
		
		
		
		System.out.print("�߰� �� �Է�:");
		addmin = sc.nextInt();
		
		
		if(hour <= 24) {
			
			if(min + addmin >= 60) {
				
				
				
				hour = hour + (min + addmin)/60;
				min = (min + addmin)%60;
				
				
				}else {
				min= min + addmin;
			
		
		
		
				}if(hour <12) {
					day = "����";
				
				}else {
					day = "����";
				}
				
				if(hour > 12) {
					hour = hour -12;
					
					System.out.println("�Է� �ð���" + addmin + "���� �߰� �� �ð���"+day+hour+"��"+min+"�� �Դϴ�.");
					
				}
	
	
	
	
	
	

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
}
}
}