package ex14;

class Box<T>{         //Box<Integer> 안에 obj, set(), get()이 들어가있다
	private T obj;
	
	void set(T obj) {this.obj = obj;}
	T get() {return this.obj;}
	
	@Override                          //오버라이딩이 없으면 주소값이 나온다
	public String toString() {
		return obj.toString();
	}
}

class Unboxer{
		//super Integer ==> Integer 이거나 Integer 상위클래스면 OK
		//Integer 계층도...... Integer -> Number -> Object
	public static void peekBox(Box<? super Integer>box) {   //? 와일드 카드
		System.out.println(box);
	}
}

class A {
	@Override
	public String toString() {
		return "A class";
	}
}

public class GenericMethod01 {

	public static void main(String[] args) {

		Box<Integer> ibox = new Box();
		ibox.set(1234);
		Unboxer.peekBox(ibox);

		Box<Number> dBox = new Box();
		dBox.set(12.5);
		Unboxer.peekBox(dBox);

		Box<Object> oBox = new Box();
		oBox.set("설날");
		Unboxer.peekBox(oBox);
		
		Box<Object> oBox2 = new Box();
		oBox2.set(new A());
		Unboxer.peekBox(oBox2);
	}
}