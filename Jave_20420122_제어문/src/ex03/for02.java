package ex03;

import java.util.Scanner;

public class for02 {

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("5개의 숫자를 입력하세요");
		
		for (int n = 0; n <=4; n++){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		sum += num;
		}
		
		System.out.println("합계 :" + sum);
		
		
	}

}