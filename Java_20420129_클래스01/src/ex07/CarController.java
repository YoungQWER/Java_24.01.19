package ex07;

public class CarController {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.displayCarDetails();
		car.setCar("그랜저",
				"현대",
				2002,
				"흰색");
		System.out.println("----------");
		car.displayCarDetails();

		System.out.println("----------");
		car.setMake("기아");
		car.setMake("k8");
		car.displayCarDetails();
		
		
		
		
	}

}
