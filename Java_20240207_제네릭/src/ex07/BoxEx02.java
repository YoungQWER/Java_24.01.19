package ex07;

class A{
	@Override
	public String toString() {
		return "A class";
	}
}
class B extends A{
	@Override
	public String toString() {
		return "B class";
	}
}
class C extends B{
	@Override
	public String toString() {
		return "C class";
	}
}

class Box<T extends A>{        //extends를 넣어 A와, A를 상속한 클래스만 들어가는 박스
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
		
		Box<A> abox = new Box<A>();
		Box<B> bbox = new Box<B>();
		Box<C> cbox = new Box<C>();
		
	}

}
