package 연산자;

import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {
		/*
		 * 버스기본요금은 1500원
		 * 
		 * 0~3 : 할인률 100%
		 * 4~13: 할인률 50%
		 * 14~19: 할인률 25%
		 * 20세이상 : 0%
		 * 65세이상 : 할인률 100%
		 * 나이 입력하면 할인율 기반해서 프로그램 작성
		 * */
		
		int age;
		int pay = 1500;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		if(age <= 3)
			System.out.println("버스요금은 : " + pay % pay + "입니다");
		else if(age <= 13)
			System.out.println("버스요금은 : " + pay /4 + "입니다");
		else if(age <= 19)
			System.out.println("버스요금은 : " + pay /2 + "입니다");
		else if(age >= 65 )
			System.out.println("버스요금은 : " + pay % pay + "입니다");
		
	}

}
