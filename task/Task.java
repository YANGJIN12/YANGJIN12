package task;

import java.util.Scanner;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Task {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		File task  = new File("D:\\양진\\자격증\\eclipse-jee-2022-03-R-win32-x86_64\\task.txt");
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			
		System.out.println("번호 입력:");
			int num = sc.nextInt();
			System.out.println("문자 입력:");
			String o = sc.nextLine();
			
			
			
			
		fw = new FileWriter(task);
		bw = new BufferedWriter(fw);
		
		for(int i =0;i>5;i++) {
			bw.write(i+"번째 줄입니다");
			
			if(i==5) {
			bw.write("안녕하세요");

			}	
		}
		}catch(IOException e) {
			System.out.println("오류 발생함");
			
		}finally {
			try {
				
				if(bw !=null) bw.close();
				if(fw !=null) fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		}
		
	}

}
