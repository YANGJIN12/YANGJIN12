package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DBConnection {
	public static BufferedReader read() throws IOException{
		//파일 객체
		File f = new File("Movie.txt"); 
		//스트림
		BufferedReader br = null;
		
		//버퍼열기
		br = new BufferedReader(br);
		//버퍼 객체 반환
		return br;
	}

	public static BufferedWriter write() throws IOException{
		//파일 객체
		File f = new File("Movie.txt");
		
		//스트림 생성
		BufferedWriter bw = null;
		
		//버퍼 생성
		bw = new BufferedWriter(bw);
		
		//버퍼반환
		return bw;
		
		
		
		
		
		
		
	}
	
	
	
}
