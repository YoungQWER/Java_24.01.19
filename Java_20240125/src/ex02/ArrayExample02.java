package ex02;

public class ArrayExample02 {

	public static void main(String[] args) {
		int[] scores;                         //배열 변수에 배열을 대입
		scores = new int[] {83,90,87};        //배열 항목의 총합을 수하고 출력
		
		int sum1 = 0;
		for(int i=0; i<3; i++)
			sum1 += scores[i];
			System.out.println("총합" +sum1);
			System.out.println("-----------");
			
			
		printItem(new int[] {83,90,87});      //배열을 매개값으로 주고, printItem() 메소드 호출
	}
	
	public static void printItem(int[] scores) {
		for(int i=0; i<3; i++)                //매개변수가 참조하는 배열의 항목을 출력
			System.out.println("score[" + i + "]:" + scores[i]);
	
	}

}
