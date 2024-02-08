package ex12;

class Box<T>{         //Box<Integer> 안에 obj, set(), get()이 들어가있다
	private T obj;
	
	void set(T obj) {this.obj = obj;}
	
	T get() {return this.obj;}
	
	@Override
	public String toString() {
		return obj.toString();
	}
}

class Unboxer{
	public static <T> void openBox(Box<T>box) {
		System.out.println(box);
	}
	
	public static void peekBox(Box<?>box) {      //? 와일드 카드
		System.out.println(box);
	}
}


public class GenericMethod01 {

	public static void main(String[] args) {

		Box<Integer> sbox = new Box();
		sbox.set(1234);
		
		System.out.println(sbox.toString());
		Unboxer.peekBox(sbox);
		Unboxer.openBox(sbox);
		
	}
}