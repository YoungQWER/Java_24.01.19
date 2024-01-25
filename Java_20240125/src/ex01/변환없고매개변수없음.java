package ex01;
/*
 * 매소드 : max
 * 매개변수 : 없음
 * 반환 : void
 * 두 수 입력받아서 최대값 반환
 */
public class 변환없고매개변수없음 {

	public static void main(String[] args) {
		
		System.out.println("최대값 출력");
		max();                                   //호출
		System.out.println("프로그램 종료");
	}

	static void max() {                          //매개변수없음
		                                        //안으로 값을 넣었을때
		int num1 = 5;
		int num2 = 20;
		
		int max = num1>num2 ? num1 : num2;
		
		System.out.println("최대값 : " + max);
		
	}
	
}
