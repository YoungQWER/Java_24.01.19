package ex03;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		/*
		 * 2문제
		 * 
		 * 1~100 사이에 
		 * 3의 배수이면서 5의 배수 합 구하고, 갯수 구하기
		 * 
		 * */
		int sum = 0;
		int count = 0;
	
		for(int i=0; i<101; i++) {
			if(i % 5 == 0 && i % 3 == 0) {
				sum = i+1;
				count = i++;
		}
			System.out.println("3과 5의 배수 합 : "+ sum +"3과 5의 배수 갯수 : " + count);
		}
	}

}

