package templet;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("=== ���� �����ϴ� �ڵ��� ===");
		Car myCar = new AICar();
		myCar.run();
		
//		����Ŭ�������� run �޼ҵ带 �Ʒ� ������ ������ ���ұ⶧����
//		����Ŭ�����鿡�� ���� ���� �۵��ؾ� �ϴ� �κи� override���ָ� �״�� ���.
//		���ø� �޼ҵ� �տ� final�� ���̸�, ����Ŭ�������� �����ǰ� �Ұ�����
//		startCar();
//		drive();
//	    stop();
//		turnOff();
		
		System.out.println("=== ����� �����ϴ� �ڵ��� ===");
		Car hisCar = new ManualCar();
		hisCar.run();

	}

}
