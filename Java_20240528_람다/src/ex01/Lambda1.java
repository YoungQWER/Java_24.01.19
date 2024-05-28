package ex01;

interface Printable{
	void print(String msg);
}

class Printer implements Printable{

	@Override
	public void print(String msg) {
		System.out.println(msg);
	}
	
}

public class Lambda1 {

	public static void main(String[] args) {
		Printable prn = new Printer();
		prn.print("출력할 메세지......");
	}

}
