package templet;

public class CarTest2 {

	public static void main(String[] args) {
		System.out.println("=== ���� �����ϴ� �ڵ��� ===");
		Car2 myCar2 = new AICar2();
		myCar2.run();
		
		System.out.println("=== ����� �����ϴ� �ڵ��� ===");
		Car2 hisCar2 = new ManualCar2();
		hisCar2.run();

	}

}
