package ex07;

import java.util.function.Function;

interface Square{
	int square(int x);
}

public class test3 {
	
	public static void main(String[] args) {
		
		Square sq = x -> x*x;
		
		System.out.println(sq.square(5));
		
	System.out.println("------------------------");
		
		Function<Integer, Integer> f = a -> a*a*a;
		//function apply() 입력O -> 출력O
		
		int result = f.apply(9);
		System.out.println(result);
	}
}


//int square(int x) {
//
//	   return x*x;
//	}