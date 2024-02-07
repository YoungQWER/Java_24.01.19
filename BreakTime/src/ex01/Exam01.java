package ex01;

class A{
	void funA() {
		System.out.println("funA");
	}
}
class B extends A{
	void funB() {
		System.out.println("funB");
	}
}
class C extends B{
	void funC() {
		System.out.println("funC");
	}
}

public class Exam01 {
	
	//                  A객체, B객체, C객체 가능
	static void testFunc(A a) {
		//funA, funB, funC를 출력하려면 어떻게 해야되나??
		
		if(a instanceof C) {                 //a가 C클래스에 포함되있나?             //testFunc(new C()); 출력
//			((C)a).funC();                   //true면 출력, false면 패스
			C c = (C)a;                      
			c.funC();                        //C클래스에 funC을 넣는다
	}
		// C클래스 안에 a를 출력
		else if(a instanceof B) {            //a가 B클래스에 속해있으면              //testFunc(new B()); 출력
//			((B)a).funB();				     
			B b = (B)a;
			b.funB();                        //B클래스에 funB를 넣는다
		}
		else
			a.funA();                                                         //testFunc(new A()); 출력
		
	}
	
	public static void main(String[] args) {
		
		//상위 클래스는 하위 클래스 참조가능
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		
		//B b1 = new A(); 하위클래스는 상위클래스 참조 불가 ==> 왜?
		//==> A a1 = new A();에서 a1이 클래스A를 참조하고 있기 때문에 b1이 못온다.
		B b2 = new B();
		B b3 = new C();
		
		//C c1 = new A();   불가..
		//C c2 = new B();   불가...
		//==> a1은 클래스A, a2는 클래스B를 참조하고 있기 때문에 C클래스를 참조하지 못한다.
		C c3 = new C();
		
		//강제 타입변환
		A aa1 = new B();
		//B bb1 = aa1; 불가 ==> 왜?                     ==> 상위클래스 값을 하위클래스의 타입으로 상속받을땐 강제 타입변환을 해야한다.
		B bb2 = (B)aa1;	 //가능 =====> 왜?              ==> aa1이 B클래스를 가져올수있어서 a11을 강제 타입변환 할수있다.
		
		A aa2 = new C();
		
		C cc1 = (C)aa2; // 가능 ==> 왜?                 ==> aa2가 C클래스를 가져올수있어서 cc1을 강제 타입변환 할수있다.
		
		System.out.println("------------------------ 1차 여기까지");
		
		testFunc(new A());   //깡통 A가 올라가고 (new A()라서 A만 올라간다.)
		testFunc(new B());   //A가 포함된 B가 올라가고
		testFunc(new C());   //A,B가 포함된 C가 올라간다
		
	}
}