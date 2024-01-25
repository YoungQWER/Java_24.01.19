package ex01;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {                        //        [][][]
		double[][] marks = new double[2][3];                        // 2행 3열  [][][] 행을 늘리면 인원수 증가
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<2; i++) {
			System.out.println("학생번호 " + (i+1));                   //학생 번호
			System.out.println("국어점수 : ");
			marks[i][0] = s.nextDouble();                           // 1,0 2,0 //1행에 점수
			
			System.out.println("수학점수 : ");
			marks[i][1] = s.nextDouble();                           // 1,1 2,1 //2행에 점수
			
			marks[i][2] = (marks[i][0] + marks[i][1])/2;            // 1,2 2,2 //3행에 평균값
		}
			
		for(int i=0; i<2; i++) {
			System.out.println("학생번호 " + (i+1));
			System.out.println("국어 :" + marks[i][0] + " ");        //1행
			System.out.println("수학 :" + marks[i][1] + " ");        //2행
			System.out.println("평균 :" + marks[i][2] + " ");        //3행
		}
	}

}
