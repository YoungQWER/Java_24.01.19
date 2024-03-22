package ex01;

interface Calculate{
	int cal(int i , int j);
}

interface Cal2{
	int cal(int a, int b);
}

public class Tests {
	
	public static void main(String[] args) {
		
		Test t = new Test();
		int sum = t.cal(10, 20);
		System.out.println(sum);
		
		Cal2 c2 = (a,b) -> a + b;
		
		int result = c2.cal(100, 200);
		System.out.println(result);
	}
}


class Test implements Calculate{

	@Override
	public int cal(int i, int j) {
		return i+j;
	}
	
	
}