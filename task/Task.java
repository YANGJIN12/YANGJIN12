package task;

import java.util.Scanner;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Task {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		File task  = new File("D:\\����\\�ڰ���\\eclipse-jee-2022-03-R-win32-x86_64\\task.txt");
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			
		System.out.println("��ȣ �Է�:");
			int num = sc.nextInt();
			System.out.println("���� �Է�:");
			String o = sc.nextLine();
			
			
			
			
		fw = new FileWriter(task);
		bw = new BufferedWriter(fw);
		
		for(int i =0;i>5;i++) {
			bw.write(i+"��° ���Դϴ�");
			
			if(i==5) {
			bw.write("�ȳ��ϼ���");

			}	
		}
		}catch(IOException e) {
			System.out.println("���� �߻���");
			
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
