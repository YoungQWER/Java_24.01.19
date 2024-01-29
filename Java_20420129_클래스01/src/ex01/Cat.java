package ex01;

public class Cat {

	String breed;        //멤버 변수(필드)  --재료(레시피)
	String color;        //앞에 private쓰면 이 클래스안에서만 사용
	

	
	//생성자(클래스 이름하고 같다)--반환타입x
	Cat(){
		System.out.println("디폴트 생성자");
	}

	
	//void(반환타입) eat(함수명) ()(매개변수)
	void eat() {         //멤버 메서드  --액션(미역을 3분 불린다..)
		System.out.println("츄르를 먹는다");
		System.out.println("칼라는 " + color + "이다");
	}
	void scratch() {
		
	}
	void meow() {
		
	}
	
}
