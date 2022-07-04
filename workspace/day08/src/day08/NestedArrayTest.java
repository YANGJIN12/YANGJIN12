package day08;

public class NestedArrayTest {

	public static void main(String[] args) {
		
		int[][] ar= {{1,2,3,4,5},{10,20},{30,40,50}};
		
		System.out.println(ar[0][2]);
		System.out.println(ar.length);
		
		
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				
				System.out.println(ar[i][j]);
			
			}
		
		
		
		}
		
		
		
	
	
	
	
	
	}
	
	
	

}
