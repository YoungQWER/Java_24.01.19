package 연산자;

import java.util.Scanner;

public class ex117p {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자 1 : ");
		int s1 = input.nextInt();
	
		System.out.println("숫자 2 : ");
		int s2 =input.nextInt();
		
		System.out.println("합계 : " + (s1+s2));
		System.out.println("평균 : " + (s1 +s2)/2.0);
	}

}
