package templet;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("=== 자율 주행하는 자동차 ===");
		Car myCar = new AICar();
		myCar.run();
		
//		상위클래스에서 run 메소드를 아래 순서로 정의해 놓았기때문에
//		하위클래스들에서 각각 따로 작동해야 하는 부분만 override해주면 그대로 출력.
//		템플릿 메소드 앞에 final을 붙이면, 하위클래스에서 재정의가 불가능함
//		startCar();
//		drive();
//	    stop();
//		turnOff();
		
		System.out.println("=== 사람이 운전하는 자동차 ===");
		Car hisCar = new ManualCar();
		hisCar.run();

	}

}
