package ex03;

import java.util.Scanner;

public class For05 {

	public static void main(String[] args) {

     	int i = 1;
     	int m;
     	int n1;
     	
     	while (i <= 4) {
     		
    		System.out.println("----------------------");
    		System.out.println("1.예금|2.출금|3.잔고|4.종료");
         	System.out.println("----------------------");
         	System.out.println("번호를 입력하세요");
     		
     	Scanner input = new Scanner(System.in);     	
     	m = input.nextInt();    		
     	
     	if(m==1) {
     		System.out.println("선택>" + m);
     		System.out.println("예금액>" + n1);
     	}else if(m==2) {
     		Scanner sc = new Scanner(System.in);
     		d = sc.nextInt();

     		System.out.println("선택>" + m);
     		System.out.println("출금액>" + n1);
     	}else if(m==3) {
     		System.out.println("선택>" + m);
     		System.out.println("잔고>" + n1);
     	}else if(m==4) {
     		System.out.println("선택>" + m);
     		System.out.println("프로그램 종료");
     		break;
     	}
     	}

	}

	
}
