package abstractPractice;

abstract class A{	//추상클래스인데 구현부가 존재해도 되는가?
	//본체가 있는 메소드는 abstract 키워드를 가질 수 없음.
	//추상 메소드 이므로 {}몸체 없이, ';'로 마무리. 선언만 가능.
	//사용하기 위해선 상속을 통해 overriding해서 메소드 b를 구체적으로 재정의 해야함.
	public abstract int b();
	//추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재할 수 있다.
	public void d() {
		System.out.println("world");
	}
}
class B extends A {
	public int b() { 	//A를 상속받은 B가 추상 메소드 b를 overriding하면 오류 해결
		return 1;
	}
}

public class AbstractDemo1 {

	public static void main(String[] args) {
//		A obj = new A();
		B obj = new B();
	}

}
