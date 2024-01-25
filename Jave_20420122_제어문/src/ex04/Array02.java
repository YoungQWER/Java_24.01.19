package ex04;

public class Array02 {

	public static void main(String[] args) {
		
		//1. int형 배열 생성후 랜덤(1~100)이용해서 배열 크기 5값 저장

		
		
		double avg =0;
		int total =0;
		
		int[] arrNum = new int[5];
		
		//1~100에 값을 랜덤하게 추출해서 저장
		
		for(int i=0; i<arrNum.length; i++) {
			int num = (int)(Math.random()*100)+1;
			arrNum[i] = num;
		}

		
System.out.println("\n--------------------------------------------");
		
		//2. 그 배열 총점, 평균 구하기

		for(int i=0; i<arrNum.length; i++)
			total += arrNum[i];
		
		avg = (double)total/arrNum.length;
		System.out.println("총점 : " + total + ", 평균 : " + avg);

System.out.println("\n--------------------------------------------");

		//3. 최대값 구하기
		int max = 0;
		
		for(int i=0; i<arrNum.length; i++) {
			if (max < arrNum[i]) {
				max = arrNum[i];
			}
		}
		System.out.println("최대값 : " + max);
		
System.out.println("\n--------------------------------------------");


		//정렬...
		for(int i=0; i<arrNum.length-1; i++) {
			for(int j=i+1; j<arrNum.length; j++) {
				int tmp;
				if(arrNum[i]>arrNum[j]) {             //작은값을 i에 넣을때
					tmp = arrNum[i];                  //tmp에 i를 넣고
					arrNum[i] = arrNum[j];            //i에 j를 넣고
					arrNum[j] = tmp;                  //j에 i를 넣는다
				}
			}
		}
		for(int i=0; i<arrNum.length; i++)            //순서대로 나열
			System.out.print( arrNum[i] + " ");
		
	}	
}
