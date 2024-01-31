package ex02;

public class Textbook extends Book{

	public Textbook() {
	}
	
	@Override
	String getDetails(){
		return super.getDetails() + " : 학문분야";
	}
}