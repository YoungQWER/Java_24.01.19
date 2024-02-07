package ex02;

public class BookController {
	public static void main(String[] args) {
		
		details(new Textbook("책", "이름", 2020));
		details(new Magazine("책", "이름", 2021));
		details(new Novel("책", "이름", 2022));
	}
		
	static void details(Book book) {
		String msg = book.getDetails();
		System.out.println(msg);
	}	
}