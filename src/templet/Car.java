package templet;

public abstract class Car {
//	������ ���� �ٸ�������� ������ �� �����Ƿ� �߻�޼ҵ� ����
	public abstract void drive();
	public abstract void stop();
	
	//��� ������ ������ ���
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
//	���������� ���� Ŭ������ ������ ���� �޶����� �κ��� �߻�޼ҵ��
//	�������� �����ϴ� �κ��� �߻�Ŭ������ �����Ͽ� ��ӹ޾� ���
	
//	���ø� �޼ҵ�
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
