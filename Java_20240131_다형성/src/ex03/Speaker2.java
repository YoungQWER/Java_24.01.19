package ex03;

public class Speaker2 extends Computer{

	@Override
	public void powerOn() {
		System.out.println("전원을 켭니다");
	}
	public void powerOff() {
		System.out.println("전원을 끕니다");
	}
	public void SoundUp() {
		System.out.println("소리를 올립니다");
	}
	public void SoundDown() {
		System.out.println("소리를 내립니다");
	}
	
}
