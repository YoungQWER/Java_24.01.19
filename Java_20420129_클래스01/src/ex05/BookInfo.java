package ex05;

public class BookInfo {

	public static void main(String[] args) {
		
		BookAccount Book = new BookAccount(
				"제목",
				"저자",
				"출판사",
				10000);
		
		
		BookAccount Book2 = new BookAccount(
				"제",
				"저",
				"출",
				30000);
		
		Book.displayBookInfo();
		
		System.out.println("-----------");
		Book2.displayBookInfo();
	}
}
