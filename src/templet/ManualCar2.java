package templet;

public class ManualCar2 extends Car2 {

	@Override
	public void drive() {
		System.out.println("����� �����մϴ�.");
		System.out.println("����� �ڵ��� �����մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("�극��ũ�� �����մϴ�.");
	}

	@Override
	public void wiper() {
		System.out.println("����� �����⸦ �����մϴ�.");
	}

}
