package ex01;
/*
 * 매소드 : max
 * 매개변수 : 없음
 * 반환 : int
 * 두 수 입력받아서 최대값 반환
 */
public class 변환있고매개변수없음 {

	public static void main(String[] args) {
		
		System.out.println("최대값 출력");
		int max = max();                         //호출
		System.out.println("최대값 : " + max);
	}

	static int max() {                          //매개변수 없애고,안으로 값을 넣었을때
		                                        
		int num1 = 5;
		int num2 = 20;
		
		if(num1 > num2)
			return num1;
		else
			return num2;
	}
	
}
