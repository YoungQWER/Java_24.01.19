package ex03;
/*
 * WAVPlayer 클래스의 play() 메소드는 "WAV 파일 재생 중..."
 * 파일 이름, 재생 시간, 파일 크기 등의 정보를 저장하는 필드를 추가합니다.
 * loadFile(file) 메소드에서는 파일 정보를 해당 필드에 저장하고, 파일이 성공적으로 로드되었음을 알리는 메시지를 출력합니다.
 * 플레이어의 상태(예: 재생 중, 정지, 일시 정지)를 저장하는 필드를 추가합니다.
 * play(), pause(), stop() 메소드는 플레이어의 상태를 업데이트하고, 현재 상태에 따라 적절한 동작을 실행합니다.
 */
public class WAVPlayer implements MediaPlayer{

	private String name;
	private double time;
	private double size;
	
	public static int state;                             //-1(정지), 0(일시정지), 1(재생)

	@Override
	public void play() {
		state = 1;                                 //재생
		System.out.println("WAV 파일 재생 중...");
	}
	
	@Override
	public void pause() {
		state = 0; 								  //일시정지
		System.out.println("재생을 일시 정지");
	}
	
	@Override
	public void stop(){
		state = -1;								  //정지
	}
	
	@Override
	public void loadFile(String file){
		System.out.println(file + "이 저장됨..");
		System.out.println("loeding....");
	}
}