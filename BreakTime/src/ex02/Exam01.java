package ex02;
//funA, funB, funC를 출력하려면 어떻게 해야할까

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

public class Exam01{

		static void test(A a) {
		
		if(a instanceof C) {                  //a가 C1클래스에 포함되있나?		//true면 출력, false면 패스
			C c = (C)a;                     
			c.funC();                         //C클래스가 true라서 funC출력
		}
		else if (a instanceof B) {            //a가 B클래스에 포함되있나?		//true면 출력, false면 패스
			B b = (B) a;
			b.funB();                         //B클래스가 true라서 funB출력
		}
		else
			a.funA();                         //A클래스가 전부false라 funA출력
		}
		public static void main(String[] args) {

			test(new A());	   //깡통 A만 올라간다.
			test(new B());     //A가 포함된 B가 올라간다.
			test(new C());     //A,B가 포함된 C가 올라간다.
		}
	}
