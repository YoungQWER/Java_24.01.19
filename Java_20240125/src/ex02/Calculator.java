package ex02;

public class Calculator {

	public static void main(String[] args) {
		powerOn();                         //메소드 호출
		powerOff();
		int num =plus(5,2);                //메소드 호출하며 값을 넣는다
			System.out.println(num);
		
		double avg= divide(5,2);
			System.out.println(avg);      //ctrl+shift+[   //옆에 창 분할

	}
		//리턴값이 없는 메소드 선언
		static void powerOn() {
			System.out.println("전원을 켭니다.");
		}
		//리턴값이 없는 메소드 선언
		static void powerOff() {
			System.out.println("전원을 끕니다.");
		}
		
		//호출 시 두 점수 값을 전달받고,
		//호출한 곳으로 결과값 int를 리턴하는 메소드 선언
		static int plus(int x, int y) {
			int result = x + y;
			return result;                //리턴값 지정;
		}
		
		//호출 시 두 점수 값을 전달받고,
		//호출한 곳으로 결과값 double를 리턴하는 메소드 선언
		static double divide(int x, int y) {
			double result = (double)x / (double)y;
			return result;                //리턴값 지정;
		}
		
	}

