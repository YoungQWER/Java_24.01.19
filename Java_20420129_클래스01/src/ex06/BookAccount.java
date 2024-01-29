package ex06;
/*
 * 도서 클래스 만들기
 * 클래스 이름: Book
 * 속성 : title(제목), author(저자), publisher(출판사),price(가격)
 * 기능 : diplayBookInfo(): 도서의 모든 정보를 출력하는 메소드
 */
public class BookAccount {

	private String title;
	private String author;
	private String publisher;
	int price;

	//this 다른 생성자 호출
	BookAccount(){
		this("제목없음", "저자없음", "출판사없음", 0);
	}	
	BookAccount(String t, String a, int pr){
		this(t, a, "출판사없음",pr);
		
	}
	
	BookAccount(String t, String a, String p, int pr){
		title = t;
		author = a;
		publisher = p;
		price = pr;
	}
	
	void displayBookInfo() {
		System.out.println("제목 :"+title);
		System.out.println("저자 :"+author);
		System.out.println("출판사 :"+publisher);
		System.out.println("가격 :"+price);
	}
}
