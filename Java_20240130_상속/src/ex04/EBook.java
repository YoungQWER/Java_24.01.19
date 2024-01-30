package ex04;
/*
 * EBook 클래스 (자식 클래스)
 * 추가속성:
 * filSize 파일크기, 실수, MB 단위
 * format 파일크기, 문자열, "PDF", "EPUB"
 * 메서드:
 * 생성자: Book 클래스의 속성과 EBook 클래스의 속성 모두를
 * 오버라이드된 displayInfo(): Book의 정보를  출력하고, 추가로 FileSize, format를 출력합니다.
 */
public class EBook extends Book{
	
	private double fileSize;
	private String format;
	
	public EBook() {}
	
	public EBook(String title, String author, int publicationYear,
			double fileSize, String format) {
		super(title, author, publicationYear);
		this.fileSize = fileSize;
		this.format = format;
	}
	
	@Override
	void displayInfo() {
		super.displayInfo();
		System.out.println(" File Size: " + fileSize + " MB ," + " Format: " + format);
	}
	
		
	
}
