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
	public static <T extends Number> Box<T> makeBox(T o) {      
		Box<T> box = new Box();
		box.set(o);
		
		System.out.println("Boxed : "+ o.doubleValue());
		return box;
	}
}

class Unboxer{
	public static <T extends Number> T openBox(Box<T> box) {               //openBox 주소를 가져온다.
		System.out.println("unboxed : "+ box.get().doubleValue());            //openBox 안에 값을 출력
		return box.get();
	}
}


public class GenericMethod01 {

	public static void main(String[] args) {
		
		Box<Double> ibox = BoxFactory.makeBox(10.2);          //Box<integer> 100을 넣은 주소값을 가져온다.
		
		double num = Unboxer.openBox(ibox);                                   //Box<integer> 안에 값을 num에 넣어서 출력
		System.out.println("data : "+ num);
	}
}