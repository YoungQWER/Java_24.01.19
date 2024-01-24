package 연산자;

import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		// 첫 번째로 입력된 값이 최대값인지 판별하기

		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 숫자 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자 입력 : ");
		int num2 = sc.nextInt();
		System.out.println("세번째 숫자 입력 : ");
		int num3 = sc.nextInt();
		
		if(num1 > num2) {
			if(num1 > num3)
				System.out.println("첫번째 숫자가 최대값입니다.");
			else
				System.out.println("첫번째 숫자가 최대값이 아닙니다");
		}
			else
				System.out.println("첫번째 숫자가 최대값이 아닙니다");
				
	}

}
