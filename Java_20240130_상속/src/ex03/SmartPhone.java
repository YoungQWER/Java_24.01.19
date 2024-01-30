package ex03;

public class SmartPhone extends Phone{
	
	private boolean wifi;
	
	public SmartPhone() {
		System.out.println("SmartPhone()");
	}
	
	public SmartPhone(boolean wifi) {
		System.out.println("2/SmartPhone(boolean wifi)");
		this.wifi = wifi;
	}
	
	public SmartPhone(String model, String color, boolean wifi) {
		super(model, color); //상위클래스 생성자 호출
		System.out.println("2.String color, boolean wifi");
		this.wifi = wifi;
	}
	@Override//이노테이션 sendVoice는 상위클래스를 재정의한다.//오타방지
	public void sendVoice(String message) {
		System.out.println("음성메세지 : " + message);
	}
	
	@Override//이노테이션 sendVoice는 상위클래스를 재정의한다.//오타방지
	public String toString() {
		System.out.println(super.toString());  //상위클래스 toString 메소드 호출
		return "4/SmartPhone [wifi=" + wifi + "]";
	}

	public void internet() {
		System.out.println("인터넷 연결!!");
		
	}
}
