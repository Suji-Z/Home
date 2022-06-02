package abstractPractice;

abstract class Calculator{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	//사용자가 직접 꾸며줘야하는 메소드는 추상으로.
	public abstract void sum();
	public abstract void avg();
	public void run() {
		//run():어떤 순서로 메소드를 호출하는가? 의 로직
		// sum,avg가 추상이기 때문에 하위클래스의 메소드를 자동 호출
		sum();
		avg();
	}
	int _sum() {	//공통된 부분은 부모클래스로 가서 초기화
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
