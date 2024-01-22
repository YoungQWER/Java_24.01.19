public class switch02 {

	public static void main(String[] args) {
		int grade = 80;
		
		switch (grade / 10) {             //범위 설정
		case 10:
		case 9:                
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		case 5:
			System.out.println("F");
			break;			
			}

	}

}
