package 연산자;

import java.util.Scanner; //패캐지 임포트

public class Scanner01 {

	public static void main(String[] args) {
		
	 Scanner input = new Scanner(System.in);           // 객체 생성
	 
	 System.out.println("당신의 나이는 : ");
	 int age = input.nextInt();                        // 숫자 int

	 System.out.println("당신의 이름을 입력하세요 : ");
	 input.nextLine();                   // 한 줄 Line
	 String name = input.nextLine();                   // 한 줄 Line
 
	 
	 System.out.println("이름은 " + name + " 나이는 " + age + "이요");
	 
	 // gifhub >> git config --global user.name ""
	 //           git config --global user.email ""
	 }

}
