package ex04;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
/* 3번
		char ch = 'A'; 
		char lowerCase = (ch>='A' && ch<='Z') ? ((char)(ch+32)) : ch; 
		System.out.println("ch:"+ch); 
	    System.out.println("ch to lowerCase:"+lowerCase);
*/
/*4번
		int num=0;

        for(int i=1; i<101; i++) {
            if(i%2==0) {
                num-=i;
            } else {
                num+=i;
            }
        }
        System.out.println("결과 : "+ num);         
*/
/*5번
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=i; j++) 
				System.out.print("*");
				System.out.println("");
		}
				System.out.println("\n------------");

		int i = 0;
		while(i<=10){
			int j=0;
			while(j<=i) {
				System.out.print("*");
				j++;
			}System.out.println();
			i++;
		}
*/
/*6번
		for (int i=1; i<=6; i++) {
			for (int j=1; j<=6; j++) {
				if(i+j == 6)
				System.out.println(i+" "+j);
			}
		}
*/
/*7번                   //1~100사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		do {
			count++;
			System.out.println("1과 100사이의 값을 입력하세요 : ");
			input = sc.nextInt();
			
			if(input > answer)
				System.out.println("더 작은 수 입력");
			else if(input < answer)
				System.out.println("더 큰 수 입력");
			else { 
				System.out.println("맞췄습니다");
			break;
			}
		}while(true);
*/
/*9번
		int [] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("sum : " + sum);
*/
/*10번
		int [] ballArr = {1,2,3,4,5,6,7,8,9};
		int [] ball3 = new int[3];
		
		for(int i=0; i<ballArr.length; i++) {
			int j = (int)(Math.random()*ballArr.length);
		int tmp = 0;
		tmp = ballArr[i];
		ballArr[i] = ballArr[j];
		ballArr[j] = tmp;
		}
		
		for(int i=0; i<ballArr.length; i++)
		System.out.println(ballArr[i]);
*/
/*//11번   //큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("money : " + money);
		for(int i = 0; i<coinUnit.length; i++) {
			int tmp = money/coinUnit[i];
			System.out.println(coinUnit[i] + "원=" + tmp);	
			money = money - tmp*coinUnit[i];
		}
*/
//12번
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[4];
		
		for(int i=0; i<answer.length; i++) {
			//1
		}
		for(int i=0; i<counter.length; i++) {
			//2
		}
		System.out.println();
		
		
		
		}
}
