package ex02;
/*
 * 메소드 : calculateEvenSum
 * 매개변수 : int
 * 반환타입 : int
 * 기능 : 주어진 정수 N까지의 모든 짝수의 합을 계산하는 함수를 작성하세요.
 */
public class Exam03 {

	public static void main(String[] args) {

		int total = calculateEvenSum(100);        //밑에 함수값 가져온다
		System.out.println("모든 짝수의 합 : " + total);		

	}
	
	static int calculateEvenSum(int num) {       //매개변수에 final 붙이면 안정성 증가
		int sum = 0;
		
		for(int i=0; i<num; i++)
			if(i % 2 == 0)
				sum +=i;
		
		return sum;
				

	}

}
