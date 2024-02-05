package ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double div = 0;
		
		System.out.println("정수 2개 입력 >>");
		
	
		try {                                   //여기부터 
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
		
			div = num1 / num2;               	//여기까지 잘못된 값이 들어올때
		}catch(InputMismatchException e) {      //알파벳
			e.printStackTrace();
		}catch(ArithmeticException e) {			//제로
			e.printStackTrace();
		}catch(Exception e) {                   //최상위 이것만 넣어도 되는데 상위 있는것들은 세부적으로 적을수있다
			e.printStackTrace();
		}finally{
			//여기는 예외가 발생하든 발생하지 않든 무조건 처리하는 구문
		}
				
		System.out.println("나누기 : " + div);
		System.out.println("프로그램 종료!!!!");
		
	}
}
