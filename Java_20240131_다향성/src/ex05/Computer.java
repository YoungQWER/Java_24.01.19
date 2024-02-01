package ex05;

public class Computer{

	Speaker3 sp = new Speaker3();
	
	
	void powerOn() {
		sp.powerOn();
	}
	void powerOff() {
		sp.powerOff();
	}
	void volumeUp() {
		sp.soundUp();
	}
	void volumeDown() {
		sp.soundDown();
	}
}
