package ex04;

public class 로또2 {

	public static void main(String[] args) {
         
		//1~45 숫자중에서 랜덤하게 6개 추출.......
		
		int [] lotto = new int[45];
		
		for(int j=0; j<5; j++) {                      //5줄
			for(int i=0; i<lotto.length; i++)         //자리 하나씩 채우기
				lotto[i] = i+1;
			

			for(int i=0; i<10000; i++) {
				int num = (int)(Math.random()*44)+1;  // 0~44에 +1 > 1~45				
				int tmp = lotto[00];                   // 같은값이 있는지 확인
				lotto[00] = lotto[num];
				lotto[num] = tmp;
			}
			
			for(int i=0; i<6; i++)                    // 6개 출력
				System.out.print(lotto[i] + " ");
			
			System.out.println();
			System.out.println("---------------------------------------------");
		}
	}
}
