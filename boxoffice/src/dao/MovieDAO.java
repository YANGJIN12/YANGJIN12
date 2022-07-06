package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import dao.DBConnection;

import dto.MovieDTO;

public class MovieDAO {
	













	// update 메서드 ->throws IOException 
	public void update(int rank, String title, String date, String revenue, int view, String screen) throws IOException {
		remove(rank);
		add(title, date,revenue, view, screen);
	}
	
	// getLastRank 메서드 -> throws IOException 
	private int getLastRank() throws IOException{
		int rank = 0;
		BufferedReader br = DBConnection.read();
		for(String line = br.readLine(); line !=null; line = br.readLine()) {
			rank++;
		}
		br.close();
		return rank;
		
	}
	
	
	// 영화 삭제하는 메서드 throws IOException 
	// remove
	public boolean remove(int rank) throws IOException{
		// 잘못된 rank가 전달되었다면
		// false return 
		if(rank < 1 || rank > getLastRank()) {
			return false;
		}
		// rank가 제대로 입력되었다면 
		// 삭제하고 
		// true return
		
		String contents = "";
		BufferedReader br = DBConnection.read();
		
		for(int i =0; i < rank-1; i++) {
			contents += br.readLine() + "\n";
		}
		br.readLine();
		for(String line = br.readLine(); line != null; line = br.readLine()) {
			contents +=  Integer.parseInt(line.split("\t")[0]) - 1 + line.substring(line.indexOf("\t")) + "\n";
		}
		br.close();
		
		BufferedWriter bw = DBConnection.write();
		bw.write(contents);
		bw.close();
		
		
		return true;
		
	}
	
	
	// 영화 추가하기 메서드 throws IOException 
	//add 
	public void add(String title, String date, String revenue, int view, String screen) throws IOException {
		String contents = "";
		int ranking = 0;
		String line = null;
		
		BufferedReader br = DBConnection.read();
		for(line = br.readLine(); line != null; line = br.readLine()) {
			ranking ++;
			String[] temp = line.split("t");
			if(Integer.parseInt(temp[4].replace(",","")) < view) {
				break;
			}
			contents += line + "\n";
	
		}
		// 반복문이 끝나면 내가 추가할 문장이 삽입될 위치
		contents += ranking + "\t" + title + "\t" + revenue + "\t" + view + "\t" + screen+ "\n";
		contents += ++ranking + line.substring(line.indexOf("\t")) + "\n";
		
		for(line = br.readLine(); line != null; line = br.readLine()) {
			contents += ++ranking + line.substring(line.indexOf("\t")) + "\n";
		}
		
		br.close();
		
		BufferedWriter bw = DBConnection.write();
		
		bw.write(contents);
		bw.close();
		
		
	}

	
	// 제목으로 검색한 영화 정보 가져오는 메서드 throws IOException 
	// selectByTitle()
	//영화 정보 ArrayList 에 담는다
	public ArrayList<MovieDTO> selectByTitle(String target) throws IOException{
		ArrayList<MovieDTO> list = new ArrayList<>();
		BufferedReader br = DBConnection.read();
		
		for(String line = br.readLine();line != null; line = br.readLine()) {
			String[] temp = line.split("\t");
			if(temp[1].contains(target)) {
				MovieDTO dto = new MovieDTO();
				dto.setRank((Integer.parseInt(temp[0])));
				dto.setTitle(temp[1]);
				dto.setDate(temp[2]);
				dto.setRevenue(temp[3]);
				dto.setView(temp[4]);
				dto.setScreen(temp[5]);
				list.add(dto);
				
			}
		}
		br.close();
		return list;
	
	}
	
	
	// 모든 영화 정보를 가져다 주는 메소드 
	//selectAll()
	
	public ArrayList<MovieDTO> selectAll() throws IOException{
		// 영화 한 편에 대한 정보는 MovieDTO에 담는다 
		// 여러개의 영화 정보는 List 에 담는다 
		ArrayList<MovieDTO> list = new ArrayList<>();
		
//		File f = new File("movie.txt");
//		FileReader fr = new FileReader(f);
//		BufferedReader br = new BufferedReader(fr);
		BufferedReader br = DBConnection.read();
		
		//읽어오기 
		
		for(String line = br.readLine(); line != null; line = br.readLine()) {
			// line 에는 영화 한편에 대한 6개의 값들이 들어있다
			String[] temp = line.split("\t");
			MovieDTO dto = new MovieDTO();
			dto.setRank(Integer.parseInt(temp[0]));
			dto.setTitle(temp[1]);
			dto.setDate(temp[2]);
			dto.setRevenue(temp[3]);
			dto.setView(temp[4]);
			dto.setScreen(temp[5]);
			
			list.add(dto);
		}

		br.close();
		
		return list;























+}