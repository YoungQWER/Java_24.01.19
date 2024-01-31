package ex04;
/*
 * Book 클래스 (부모 클래스)
 * 속성 : 
 * title 책 제목, 문자열
 * author 저지, 문자열
 * publicationYear 출판연도, 정수
 * 생성자: 
 */

public class Book {
	
	private String title;
	private String author;
	private int publicationYear;
	
	public Book() {}   //디폴트 생성자
	
	public Book(String title, String author, int publicationYear) {
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;             //생성자의 모든 속성을 초기화
	}
	
	void displayInfo() {
		System.out.println( "Title: " + title + " Author: " + author + " Year: " + publicationYear);
	}
	

	

}
