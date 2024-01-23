package 연산자;

import java.util.Scanner;

public class ifelse03 {

	public static void main(String[] args) {
		/*
		 * 세 정수를 입력받아서 최대값 구하기
		 * */

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 1 :");
		int num1 = sc.nextInt();
		
		System.out.println("숫자 2 :");
		int num2 = sc.nextInt();
		
		System.out.println("숫자 3 :");
		int num3 = sc.nextInt();
		
		int max;
		max = num1;
		
		if (max > num2) {
			if(num3 > max) {
				max = num2;
			}else {
					max = num3;
					if(num2 > num3) {
						max = num3;
					}else {
						max = num3;
				}
			}
			
			System.out.println("최대값 : " + max);
		}
		
	}

}
