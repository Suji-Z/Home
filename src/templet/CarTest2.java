package templet;

public class CarTest2 {

	public static void main(String[] args) {
		System.out.println("=== 자율 주행하는 자동차 ===");
		Car2 myCar2 = new AICar2();
		myCar2.run();
		
		System.out.println("=== 사람이 운전하는 자동차 ===");
		Car2 hisCar2 = new ManualCar2();
		hisCar2.run();

	}

}
