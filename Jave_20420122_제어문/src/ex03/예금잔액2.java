package ex03;

import java.util.Scanner;

public class 예금잔액2 {

	public static void main(String[] args) {
		
		int bankBalance = 0;
		int tmp;
		boolean flag=true;
		
		Scanner sc = new Scanner(System.in);         //한번만
		
		for(;flag == true;) {                        //계속 반복
			System.out.println("-----------------------------");
			System.out.println("1.예금\t|2.출금\t3.잔고\t4.종료");
			System.out.println("-----------------------------");
			int num = sc.nextInt();
			
		switch(num) {
		case 1 :
			System.out.println("예금액>>");
			tmp = sc.nextInt();
			bankBalance += tmp;
			break;
		case 2 :
			System.out.println("출금액>>");
			tmp = sc.nextInt();
			bankBalance -= tmp;
		case 3 : 
			System.out.println("잔고>>" + bankBalance + "\n");
			break;
		default :
			flag = false;
			break;
			
		}

	}
		System.out.println("프로그램 종료");
	}
}