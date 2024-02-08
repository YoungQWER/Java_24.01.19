package ex06;


// Box 클래스를 통해서 생성되는 대상은 *정수 및 *실수만 클래스만 생성한다.
class Box<T extends Number>{   //Number하위클래스만 가능 (정수, 실수)
	private T obj;
	
	void set(T obj) {
		this.obj = obj;
	}
	T get() {
		return obj;
	}
}

public class BoxEx02 {

	public static void main(String[] args) {
		
		Box<Integer> ibox = new Box<Integer>();
		Box<Double> dbox = new Box<Double>();
		Box<Short> sbox = new Box<Short>();
		
//		Box<String> stbox = new Box<String>();       에러
		
		
	}
}
