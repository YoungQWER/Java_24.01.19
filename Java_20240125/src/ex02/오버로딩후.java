package ex02;

public class 오버로딩후 {

	public static void main(String[] args) {
		
		System.out.println(add(10,20));
	
		System.out.println(add(10,20,30));

		System.out.println(add(10.2,20.2));
		
		
	}

	static int add(int i, int j) {
		System.out.println("add(int i, int j)");
		return i+j;
	}

	static int add(int i, double j) {
		System.out.println("add(int i, double j)");
		return (int)(i+j);
	}

	static int add(int i, int j, int x) {
		return i+j+x;
	}
	
	static double add(double i, double j) {
		return i+j;
	}
	
	
	
}