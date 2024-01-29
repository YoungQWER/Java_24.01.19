package ex07;
/*
 * 자동차 클래스 만들기
 * 클래스 이름: Car
 * 속성: make(제조사), model(모델), year(제조년도), color(색상)
 * 기능: startEngine():엔진을 켜는 메소드
 *      stopEngine():엔진을 끄는 메소드
 *      displayCarDetails():자동차의 모든 정보를 출력하는 메소드
 *      초기화 : setter이용
 */

public class Car {
	
	private String make;
	private String model;
	private int year;
	private String color;
	
	//setter 
	void setMake(String m) {
		make = m;
	}
	void setModel(String m) {
		model = m;
	}
	
	//생성자보다는 효율성이 떨어진다..
	void setCar(String m, String mo, int y, String c) {
		make = m;
		model = mo;
		year = y;
		color = c;
	}
	
	void displayCarDetails() {
		System.out.println("제조사 " +make);		
		System.out.println("모델 " +color);
		System.out.println("연식 " +model);
		System.out.println("색상 " +year);
	}

	
	
	
	private boolean engine;
	
	boolean startEngine(){
		return engine = true;
	}
	
	boolean stopEngine(){
		return engine = false;
	}
	
	
}
