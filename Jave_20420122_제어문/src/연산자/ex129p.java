package 연산자;

import java.util.Scanner;

public class ex129p {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성적 입력 : ");
		
		int com = sc.nextInt();
		
		if(com >= 90) {
			System.out.println("A학점");
		}else if(com >= 80) {
			System.out.println("B학점");
		}else if(com >= 70) {
			System.out.println("C학점");
		}else if(com >= 60) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}

	}

}
