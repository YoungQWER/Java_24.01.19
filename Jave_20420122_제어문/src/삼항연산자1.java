
public class 삼항연산자1 {

	public static void main(String[] args) {
		
		int jumsu = 90;
		
		if(jumsu >= 60)
			System.out.println("합격");
		else
			System.out.println("불합격");
		
		//삼항 연산자 이용해서 병행
		
		String msg = ( jumsu >= 60 ) ? ("합격") : ("불합격");
		                  //조건
		
        //String msg = "합격"
		
		System.out.println(msg);
		
		
	}

}
