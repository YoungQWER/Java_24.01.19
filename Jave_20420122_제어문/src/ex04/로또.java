package ex04;

public class 로또 {

	public static void main(String[] args) {

		//1~45 숫자중에서 랜덤하게 6개 추출.......
		
		int[] Lotto = new int[6];
		boolean flag = false;
		
		for(int j=0; j<5; j++) {
			
			for (int i=0; i<Lotto.length; i++) {
				flag = false;
				int num = (int)(Math.random()*45)+1;
				
				for(int k=0; k<i; k++) {
					if(num == Lotto[k]) {
						flag = true;
						break;
					}
				}
				if(flag) {
					i--;
					continue;
				}
				Lotto[i] = num;
			}
		
			for(int i=0; i<Lotto.length; i++)
				System.out.print(Lotto[i] + " ");

			System.out.println("\n-----------------");
		}
			

	}

}

