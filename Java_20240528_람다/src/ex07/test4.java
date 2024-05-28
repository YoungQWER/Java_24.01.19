package ex07;

import java.util.function.Supplier;

@FunctionalInterface
interface RollA{
	int roll();
}


public class test4 {
	public static void main(String[] args) {
		
		RollA ro = () -> (int)(Math.random()*6);
		
		System.out.println(ro.roll());
		
	System.out.println("-----------------");
		
		Supplier<Integer> s = () -> (int)(Math.random() * 6);
		//Suppier get() 입력x -> 출력O
 		
		System.out.println(s.get());
	}
}


//int roll() {
//
//	   return (int)(Math.random() * 6);
//	}