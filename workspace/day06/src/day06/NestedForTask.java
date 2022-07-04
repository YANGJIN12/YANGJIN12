package day06;

import java.util.Scanner;
public class NestedForTask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		
		//*****
		//*****
		//*****
		//*****
		//*****
		
		//*
		//**
		//***
		//****
		//*****
		

		
//		for(int i =0;i<5;i++) {
//			System.out.println("*****");
			
			
			
			
			
//			
//			for(int i=0;i<5;i++) {
//				for(int j=0;j<i+1;j++) {
//					System.out.print("*");
//					
//				}
//				System.out.println();
//				
				
				
		//     *
		//    **
		//	 ***
		//  ****
		// *****
//		
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<4-i;j++) {
//				System.out.print("*");
//				
//			}
//		}
//			
//		for(int j=0;j<i + 1;j++) {
//			System.out.print("*");
//		}
//			
//			System.out.println();
//			
			
		
		//   *   
		//  **   
		// ***
		// ****
		
			for(int i=0;i<5;i++) {
				for(int j=0;j<4-i;j++) {
					System.out.print("");
					
				}
				for(int j=0;j<i+1;j++) {
					System.out.print("*");
					
				}
				for(int j=0;j<2*i;j++) {
					System.out.print("*");
				}
			}System.out.println();
		
	}
}






























	


