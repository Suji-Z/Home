package abstractPractice;

abstract class Calculator{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	//����ڰ� ���� �ٸ�����ϴ� �޼ҵ�� �߻�����.
	public abstract void sum();
	public abstract void avg();
	public void run() {
		//run():� ������ �޼ҵ带 ȣ���ϴ°�? �� ����
		// sum,avg�� �߻��̱� ������ ����Ŭ������ �޼ҵ带 �ڵ� ȣ��
		sum();
		avg();
	}
	int _sum() {	//����� �κ��� �θ�Ŭ������ ���� �ʱ�ȭ
		return this.left+this.right;
	}
}
class CalculatorDecoPlus extends Calculator{
	public void sum() {
		System.out.println("+ sum :" + _sum());
	}
	public void avg() {
		System.out.println("+ avg :"+(this.left+this.right)/2);
	}
}
class CalculatorDecoMinus extends Calculator{
	public void sum() {
		System.out.println("- sum :"+ _sum());

	}
	public void avg() {
		System.out.println("- avg :"+(this.left+this.right)/2);
	}
}
public class AbstractCalEx1 {

}
