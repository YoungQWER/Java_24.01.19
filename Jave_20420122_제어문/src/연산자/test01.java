package 연산자;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		/* 1. 숫자 입력
		 * 2. 이 숫자가 3의 배수이면서 5의 배수이면 "좋아요"
		 * 아니면 "싫어요"*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 숫자입력 : ");
		
		int num = sc.nextInt();
		
		if(num % 3 == 0 ) {
			if(num % 5 == 0) 
				System.out.println("좋아요");
			else
				System.out.println("싫어요");
			}
			else if(num % 5 == 0)
			if(num % 3 == 0)
			System.out.println("좋아요");
			else
				System.out.println("싫어요");
		
	}
}

