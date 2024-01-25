package ex01;
/*
 * 매소드 : max
 * 매개변수 : int,int
 * 반환 : void
 * 두 수 입력받아서 최대값 반환
 */
public class 변환없고매개변수있음 {                          //제일 많이 쓰인다

	public static void main(String[] args) {
		
		System.out.println("최대값 출력");
		max(5, 10);                                  
		System.out.println("프로그램 종료");
	}

	static void max(int n1, int n2) {                 //변환을 void로           
		                                        		
		int max = n1 > n2? n1 : n2;
		
		System.out.println("최대값 : " + max);
		
	}
	
}
