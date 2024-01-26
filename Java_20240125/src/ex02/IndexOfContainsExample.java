package ex02;

public class IndexOfContainsExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
				
		int location = subject.indexOf("프로그래밍");       //indexOf 몇번부터 시작하는지
		System.out.println(location);                    //subject가 3
		String substring = subject.substring(location);  //subject부터 출력
		System.out.println(substring);                   //프로그래밍
		
		location = subject.indexOf("자바");               //0번째
		if(location != -1)                               //0번째 같지않다 if출력
			System.out.println("자바와 관련된 책이군요.");
		else
			System.out.println("자바와 관련 없는 책이군요.");
		
		boolean result = subject.contains("자바");        //True
		if(result)
			System.out.println("자바와 관련된 책이군요.");
		else
			System.out.println("자바와 관련 없는 책이군요.");
	}

}
