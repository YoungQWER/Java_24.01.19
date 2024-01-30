package ex08;

public class PersonController {

	public static void main(String[] args) {
		
		//인스턴스 메소드는 객체를 생성한 다음 참조변수로 접근 가능 
		Person.staticshow();                       
		
		
		Person p1 = new Person();
		p1.showInfo();
		
		//스태틱 메소드는 객체 생성하진않고 바로 접근 가능
		//클래스명, 메소드명으로 호출가능


	}

}
