package 연산자;

import java.util.Scanner;

public class ifelse04 {

	public static void main(String[] args) {
		// 첫 번째로 입력된 값이 최대값인지 판별하기
		System.out.println("3개의 숫자를 입력하세요 : ");
	    
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		if (num1 > num2) {
			if(num1 > num3){
				System.out.println(num1 + "은 가장 큰 값입니다");
			}
			else {
				System.out.println(num1 +"은 가장 큰 값이 아닙니다");
			}
		}else {
			System.out.println(num1 + "은 가장 큰 값이 아닙니다");
		}
	}
}
