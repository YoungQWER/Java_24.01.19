package ex04;

public class 로또3 {

	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		for (int j=0; j<5; j++) {
			System.out.println("\n----------------");
			
			for(int i = 0; i<lotto.length; i++) {                                  //6개 돌리기
				int ran = (int)(Math.random()*45)+1;                               //1~45 뽑기
			
				int k=0;       //for 밑까지 쭉 적용
				for(k=0; k<i; k++) {                                               //중복체크
					if(lotto[i] == ran) break;
			}
				
				if(lotto[k] == ran) {                                              //중복제거
					i--;
					continue;
				}
				
				lotto[i] = ran;
				System.out.print(lotto[i] + " ");
				
				}
			}
		
		
		
		
		
		}	
	}
