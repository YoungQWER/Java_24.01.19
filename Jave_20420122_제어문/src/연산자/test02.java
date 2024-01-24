package 연산자;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		/*
		 * 두 정수 입력 받아서 5, 10
		 * 큰 값, 작은 값으로 출력
		 * 큰 값 : 10
		 * 작은 값 : 5
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수 : ");
				int num1 = sc.nextInt();
		System.out.println("두번째 정수 : ");
				int num2 = sc.nextInt();
				
				if(num1 > num2)
					System.out.println("큰 값 : " + num1+ "\n" + "작은 값 : " + num2);
				else if(num2 > num1)
					System.out.println("큰 값 : " + num2 + "\n" + "작은 값 : " + num1);
				else
					System.out.println("같은 숫자입니다");
				
	}

}
