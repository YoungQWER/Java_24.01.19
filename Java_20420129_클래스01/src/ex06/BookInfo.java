package ex06;

public class BookInfo {

	public static void main(String[] args) {
		
		BookAccount Book = new BookAccount(
				"제목",
				"저자",
				"출판사",
				10000);

		
		Book.displayBookInfo();
	}
}
