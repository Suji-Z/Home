package abstractPractice;

abstract class A{	//�߻�Ŭ�����ε� �����ΰ� �����ص� �Ǵ°�?
	//��ü�� �ִ� �޼ҵ�� abstract Ű���带 ���� �� ����.
	//�߻� �޼ҵ� �̹Ƿ� {}��ü ����, ';'�� ������. ���� ����.
	//����ϱ� ���ؼ� ����� ���� overriding�ؼ� �޼ҵ� b�� ��ü������ ������ �ؾ���.
	public abstract int b();
	//�߻� Ŭ���� ������ �߻� �޼ҵ尡 �ƴ� �޼ҵ尡 ������ �� �ִ�.
	public void d() {
		System.out.println("world");
	}
}
class B extends A {
	public int b() { 	//A�� ��ӹ��� B�� �߻� �޼ҵ� b�� overriding�ϸ� ���� �ذ�
		return 1;
	}
}

public class AbstractDemo1 {

	public static void main(String[] args) {
//		A obj = new A();
		B obj = new B();
	}

}
