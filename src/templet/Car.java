package templet;

public abstract class Car {
//	차종에 따라 다른방식으로 움직일 수 있으므로 추상메소드 선언
	public abstract void drive();
	public abstract void stop();
	
	//어느 차에나 동일한 방법
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
//	구현내용이 하위 클래스의 종류에 따라 달라지는 부분은 추상메소드로
//	공통으로 동작하는 부분은 추상클래스에 구현하여 상속받아 사용
	
//	템플릿 메소드
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
