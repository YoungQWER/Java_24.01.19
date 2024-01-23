package ex04;

public class 로또 {

	public static void main(String[] args) {

		//1~45 숫자중에서 랜덤하게 6개 추출.......
		
		int Lotto[] = new int[6];                       //6칸
		boolean flag = false;
		
		for(int j=0; j<5; j++) {                        //i=5
			
			for (int i=0; i<Lotto.length; i++) {
				flag = false;                           
				int num = (int)(Math.random()*45)+1;    //45개 숫자
					
				for(int k=0; k<i; k++) {                //i=5
					if(num == Lotto[k]) {
						flag = true;                    //중복 숫자 거르기
						break;
					}
				}		
				if(flag) {                              //
					i--;
					continue;                           // 14번째 줄로
				}
				Lotto[i] = num;
			}
		
			for(int i=0; i<Lotto.length; i++)
				System.out.print(Lotto[i] + " ");
			System.out.println("\n-----------------");
		}
			

	}

}

