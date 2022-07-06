package dto;

public class MovieDTO {
	//영화 정보를 저장
	//순위,영화제목,개봉일,매출액,관객수,상영관수
	//rank(int),title,date,revenue,view(int),screen
	//>private 변수로 만들어서 게터 세터
	
	
	private int rank, view;
	   private String title, date, revenue, screen;
	   
	   public int getRank() {
	      return rank;
	   }
	   public void setRank(int rank) {
	      this.rank = rank;
	   }
	   public String getTitle() {
	      return title;
	   }
	   public void setTitle(String title) {
	      this.title = title;
	   }
	   public String getDate() {
	      return date;
	   }
	   public void setDate(String date) {
	      this.date = date;
	   }
	   public String getRevenue() {
	      return revenue;
	   }
	   public void setRevenue(String revenue) {
	      this.revenue = revenue;
	   }
	   public int getView() {
	      return view;
	   }
	   public void setView(int view) {
	      this.view = view;
	   }
	   public String getScreen() {
	      return screen;
	   }
	   public void setScreen(String screen) {
	      this.screen = screen;
	   }
	   

	

}
