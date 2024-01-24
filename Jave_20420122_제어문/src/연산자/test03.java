package 연산자;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		/*
		 * 세 정수를 입력받아서 최대값 구하기
		 * */

		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수 입력: ");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수 입력: ");
		int num2 = sc.nextInt();
		System.out.println("세번째 정수 입력: ");
		int num3 = sc.nextInt();
				
		int max;
		max = num1;
		
		if(max < num2)
			max = num2;
		if(max < num3)
			max = num3;
			
			System.out.println("가장 큰 수는 : " + max);
		

	}

}
