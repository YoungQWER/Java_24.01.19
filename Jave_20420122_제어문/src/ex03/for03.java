	package ex03;

public class for03 {

	public static void main(String[] args) {
		/*
		 * 2문제
		 * 
		 * 1~100 사이에 
		 * 3의 배수이면서 5의 배수 합 구하고, 갯수 구하기
		 * 
		 * */
		
		int n1 = 0;
		int n2 = 0;
		
		for(int i=1; i<101; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				n1 += i;
		        n2++;
		        }
    	}
		System.out.println("3의 배수이면서 5의 배수의 합 : " + n1 +" 갯수 : " + n2);		
	}
}

