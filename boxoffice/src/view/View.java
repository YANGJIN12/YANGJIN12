package view;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import dao.MovieDAO;
import dto.MovieDTO;



public class View {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		MovieDAO dao = new MovieDAO();
//		순위,영화제목,개봉일,매출액,관객수,상영관수
//		rank(int),title,date,revenue,view(int),screen
		//화면을 구성할 부분	
//		1.영화추가하기
//		2.정보수정하기
//		3.검색하기
//		4.삭제하기
//		5.모든 영화목록보기
//		6.종료하기
		while(true) {
		System.out.println("1.영화정보 추가하기");
		System.out.println("2.영화정보 수정하기");
		System.out.println("3.영화정보 검색하기");
		System.out.println("4.영화정보 삭제하기");
		System.out.println("5.모든영화 목록보기");
		System.out.println("6.종료하기");
		System.out.println("입력:");
		
		int choice = Integer.parseInt(sc.nextLine());
		
			
		
		if(choice == 1) {
			System.out.println("영화 순위 :");
			int rank = Integer.parseInt(sc.nextLine());
			System.out.println("영화 제목 :");
			String title = sc.nextLine();
			System.out.println("영화 개봉일 :");
			String date = sc.nextLine();
			System.out.println("영화 매출액 :");
			String revenue = sc.nextLine();
			System.out.println("영화 관객수 :");
			int view = Integer.parseInt(sc.nextLine());
			System.out.println("영화 상영관수 :");
			String screen = sc.nextLine();
			
			dao.add(title,date,revenue,view,screen);
			
	
		}else if(choice == 2){
			System.out.println("영화 순위 수정 :");
			int rank = Integer.parseInt(sc.nextLine());
			System.out.println("영화 제목 수정 :");
			String title = sc.nextLine();
			System.out.println("영화 개봉일 수정 :");
			String date = sc.nextLine();
			System.out.println("영화 매출액 수정 :");
			String revenue = sc.nextLine();
			System.out.println("영화 관객수 수정 :");
			int view = Integer.parseInt(sc.nextLine());
			System.out.println("영화 상영관수 수정 :");
			String screen = sc.nextLine();
			
			dao.update(title,date,revenue,view,screen);
			
		
		
		}else if(choice == 3) {
			System.out.println("검색할 내용 :");
			String target = sc.nextLine();
			ArrayList<MovieDTO> list = dao.selectByTitle(target);
			
			if(list.size() == 0) {
				System.out.println("검색결과가 없습니다");
				continue;
				}
			System.out.println("---" + target +"검색 결과---");
			for (MovieDTO dto : list) {
				System.out.println("-["+ dto.getRank()+"위]:"+dto.getTitle()+"-----");
				System.out.println("|제목:"+dto.getTitle());
				System.out.println("|개봉일:" + dto.getDate());
				System.out.println("|관객수:"+dto.getView());
				System.out.println("|매출액:"+dto.getRevenue());
				System.out.println("|상영관수:"+dto.getScreen());
			}
		
		}else if(choice == 4) {
			System.out.println("삭제할 내용 :");
			String remove = sc.nextLine();
			ArrayList<MovieDTO> list = dao.remove();
			
			
			int rank = Integer.parseInt(sc.nextLine());
			if(dao.remove(rank)) {
				System.out.println("삭제 성공");
			}else {
				System.out.println("삭제 실패");
			}
			
			
			
			
		
		
		}else if(choice == 5) {
			ArrayList<MovieDTO> list = dao.selectAll();
			System.out.println("---모든 영화 목록---");
			for (MovieDTO a : list) {
				System.out.println("-["+ a.getRank()+"위]:"+a.getTitle()+"-----");
				System.out.println("|제목:"+a.getTitle());
				System.out.println("|개봉일:" + a.getDate());
				System.out.println("|관객수:"+a.getView());
				System.out.println("|매출액:"+a.getRevenue());
				System.out.println("|상영관수:"+a.getScreen());
			}
			
			
			
			
			
			
		
		
		}else if(choice == 6){
			System.out.println("종료합니다.");
			break;
		}else {
			System.out.println("잘못 입력하셨습니다! 다시 입력하세요.");
		}
		System.out.println();
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
