package ex03;

public class For04 {

	public static void main(String[] args) {
		/*
		 * 1문제
		 * 
		 * 1~100사이에
		 * 홀수합과 짝수합을 구하시오
		 * 
		 * */
		
		int even = 0;  //짝수 합
		int odd = 0;   //홀수 합
		
		for(int i=0; i<=100; i++) {
			
			if(i % 2 == 0)
				even += i;    //even = even +i;
			else
				odd += i;
		}
		
		System.out.println("짝수 합 : " + even);
		System.out.println("홀수 합 : " + odd);
	}
}