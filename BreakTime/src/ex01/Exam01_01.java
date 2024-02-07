package ex01;

class A1{
	void funA() {
		System.out.println("funA");
	}
}
class B1 extends A1{
	void funB() {
		System.out.println("funB");
	}
}
class C1 extends B1{
	void funC() {
		System.out.println("funC");
	}
}

public class Exam01_01{

		static void test(A1 a) {
		
		if(a instanceof C1) {                 //a가 C1클래스에 포함되있나?		//true면 출력, false면 패스
			C1 c = (C1)a;                     
			c.funC();                         //C클래스가 true라서 funC출력
		}
		else if (a instanceof B1) {           //a가 B클래스에 포함되있나?		//true면 출력, false면 패스
			B1 b = (B1) a;
			b.funB();                         //B클래스가 true라서 funB출력
		}
		else
			a.funA();                         //A클래스가 전부false라 funA출력
		}
		public static void main(String[] args) {

			test(new A1());		//깡통 A만 올라간다.
			test(new B1());     //A가 포함된 B가 올라간다.
			test(new C1());     //A,B가 포함된 C가 올라간다.
		}
	}
