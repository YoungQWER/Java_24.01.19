package ex01;

public class EqualEx02 {

	public static void main(String[] args) {

		Box1 b1 = new Box1("korea");
		Box1 b2 = new Box1("korea");
		
		System.out.println("1 >> " + (b1 == b2));
		System.out.println("2 >> " + (b1.equals(b2)));
	}

}


class Box1{
	String str;
	public Box1(String str) {
		this.str = str;
	}
}