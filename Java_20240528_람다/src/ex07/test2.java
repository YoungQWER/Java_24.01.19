package ex07;

import java.util.function.BiConsumer;

interface PrintVariable{
	void printVar(String name, int i);
		
}

public class test2 {
	
	public static void main(String[] args) {
		
		PrintVariable result = (name, i) -> System.out.println(name +"="+ i);
		
		result.printVar("name", 10);
				
	System.out.println("---------------");
	
		BiConsumer<String, Integer> bc =
				(name, i) -> System.out.println(name+"="+i);
		
		bc.accept("로어", 13);
	}
}


//int printVar(String name, int i) {
//
//	   System.out.println(name+"="+i);
//	}