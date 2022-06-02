package abstractPractice;

public abstract class Computer {
	public abstract void display();
	public abstract void typing();
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}

//	1.��ӹ��� ��� �߻� Ŭ������ ������ ��쿣 �߻�X
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
// 2. ��� �߻� Ŭ������ �������� ������, �߻� Ŭ������
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
