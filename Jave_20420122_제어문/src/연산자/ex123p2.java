package 연산자;

import java.util.Scanner;

public class ex123p2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("나이 입력 : ");
		
		int age = input.nextInt();
						
		if (age >= 20) {
		System.out.println("성년입니다.");
	}
		else {
		System.out.println("미성년입니다.");	
    }
}
}