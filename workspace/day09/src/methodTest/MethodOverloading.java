package methodTest;

public class MethodOverloading {
	public void add(int a,int b) {
		System.out.println(a+b);
	}

	public int add(int a,int b,int c) {
		return a+b+c;

}
	public int add(int a,int b,int c,int d) {
		return a+b;
	}
	
}
