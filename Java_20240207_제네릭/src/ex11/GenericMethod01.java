package ex11;

class Box<T>{         //Box<Integer> 안에 obj, set(), get()이 들어가있다
	protected T obj;
	
	void set(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return this.obj;
	}
}

class SteelBox<T> extends Box<T>{
	public SteelBox(T o) {
		obj = o;
	}
}

public class GenericMethod01 {

	public static void main(String[] args) {
		
		Box<Integer> ibox = new SteelBox(1234);
		Box<String> sbox = new SteelBox("korea");
		//제네릭 상속에서 Box -> SteelBox는 상속관계를 유지하지만
		// Box<Number>와 SteelBox<Integer> 는 타겟은 반드시 같은 타입이여야한다.
		
		System.out.println(ibox.get());
		System.out.println(sbox.get());
 	}
}