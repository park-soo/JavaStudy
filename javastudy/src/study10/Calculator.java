package study10;

public abstract class Calculator implements Calc { // Calc클래스의 추상메서드를 다 오버라이딩 하지 않으면 추상 클래스로 사용해야 된다.

	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}
	
	@Override
	public int sub(int num1, int num2) {
		return num1-num2;
	}
}
