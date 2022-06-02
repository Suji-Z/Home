package abstractPractice;

public abstract class Computer {
	public abstract void display();
	public abstract void typing();
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

//	1.상속받은 모든 추상 클래스를 구현한 경우엔 추상X
public class DeskTop extends Computer{

	@Override
	public void display() {
		System.out.println("DeskTop display()");
	}
	@Override
	public void typing() {
		System.out.println("DeskTop typing()");
	}
	
}
// 2. 모든 추상 클래스를 구현하지 않으면, 추상 클래스로
public abstract class NoteBook extends Computer { 
	public void display() {
		System.out.println("NoteBook dsiplay()");
	}
}
public class MyNoteBook extends NoteBook {

	@Override
	public void typing() {
		System.out.println("MyNoteBook typing()");
	}
	
}

}
