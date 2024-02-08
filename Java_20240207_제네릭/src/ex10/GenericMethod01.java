package ex10;

class Box<T>{     //T --> String           //Box<Integer> 안에 obj, set(), get()이 들어가있다
	private T obj;
	
	void set(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return this.obj;
	}
}

class BoxFactory{
	public static <T extends Number> Box<T> makeBox(T o) {       //Box<integer> 100을 넣은 주소값을 가져온다.
		Box<T> box = new Box();
		box.set(o);
		
		System.out.println("Boxed : "+ o.intValue());
		return box;
	}
}

class Unboxer{
	public static <T extends Number> T openBox(Box<T> box) {
		System.out.println("unboxed : "+ box.get().intValue());
		return box.get();
	}
}


public class GenericMethod01 {

	public static void main(String[] args) {
		
		Box<Integer> ibox = BoxFactory.makeBox(new Integer(100));          //박스팩토리
		
		int num = Unboxer.openBox(ibox);                                   //언박스
		System.out.println("data : "+ num);
	}
}
