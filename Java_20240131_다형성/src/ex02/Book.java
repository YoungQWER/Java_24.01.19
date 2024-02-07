package ex02;

public class Book {
	private String title;
	private String author;
	private int publishYear;
		
	public Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.publishYear = year;
	}
	
	String getDetails(){
		return title + " : " + author + " : " + publishYear;
	}
}