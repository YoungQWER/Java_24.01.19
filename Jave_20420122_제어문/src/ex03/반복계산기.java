package ex03;

import java.util.Scanner;

public class 반복계산기 {

	public static void main(String[] args) {
		
		System.out.print("길이 : ");
		
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		
		
		for (int i = 0; i < len; i++) {
		
			for (int j = 0; j < i; j++)
				System.out.print(" ");             //빈칸출력
		
		for (int j = 0; j < (2*len)-1-(i*2); j++)
			System.out.print("*");                 //별
		
		System.out.println("");                    //줄변경

		}
	}
}
