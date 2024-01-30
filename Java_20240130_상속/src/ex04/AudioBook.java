package ex04;
/*
 * AudioBook클래스 (자식 클래스)
 * 추가속성:
 * length 
 * narrator 
 * 메서드:
 * 생성자: Book클래스의 속성과 AudioBook클래스의 속성 모두를 초기화합니다.
 * 오버라이드된 displayInfo(): Book의 정보를 출력하고, 추가로 Length, narrator를 출력합니다.
 */
public class AudioBook extends Book{
	
	private double length;
	private String narrator;
	
	public AudioBook() {}
	
	public AudioBook(String title, String author, int publicationYear,
			double fileSize, String format,
			double length, String narrator) {
		super(title, author, publicationYear);
		this.length = length;
		this.narrator = narrator;
	}
	
	@Override
	void displayInfo() {
		super.displayInfo();
		System.out.println(" Length: " + length + " hours " + " Narrator: " + narrator);
	}
}
