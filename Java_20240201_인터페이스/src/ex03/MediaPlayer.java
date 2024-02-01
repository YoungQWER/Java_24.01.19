package ex03;
/*
 * play() 메소드
 * 다양한 미디어 파일 형식 지원
 * main 메소드에서 MP3Player, WAVPlayer, FLACPlayer의 인스턴스를 생성합니다.
 * pause(), stop(), loadFile(file) 메소드를 추가합니다.
 * loadFile(file) 메소드는 미디어 파일을 로드하는 기능을 정의합니다.
 * pause() 메소드는 미디어 파일의 재생을 일시 정지하는 기능을 정의합니다.
 * stop() 메소드는 미디어 파일의 재생을 정지하고 처음으로 되돌리는 기능을 정의합니다.
 * 
 */

public interface MediaPlayer {

	public void play();
	public void pause();
	public void stop();
	default void loadFile(String file) {
		System.out.println(file + "로딩 중......");
	}

		
}
