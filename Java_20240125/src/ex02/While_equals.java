package ex02;

import java.util.Scanner;

public class While_equals {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			boolean run = true;
			int speed = 0;
			
			while(run) {
				System.out.println("-----------------------");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("-----------------------");
				System.out.print("선택: ");
				
			String strNum = sc.nextLine();
			
			if(strNum.equals("1")) {             // strNum의 좌표가 아니라 안에 객채를 볼때 사용
				speed++;
				System.out.println("현재 속도 = "+speed);
			}else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도 = "+speed);
			}else if(strNum.equals("3"))
				run = false;
			}
			System.out.println("프로그램 종료");
	}

}
