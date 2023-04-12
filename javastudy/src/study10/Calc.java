package study10;

public interface Calc {

	// 상수
	final double PI = 3.14;
	final int ERROR = -9999;

	// 추상 메서드
	int add(int num1, int num2);
	int sub(int num1, int num2);
	int times(int num1, int num2);
	double div(int num1, int num2);
// java 8 이후

	// default 메서드 : 공통적으로 구현해야 하는 메서드
	default void desc() {
		privateMethod();
		privateStaticMethod();
		System.out.println("계산기 구현");
	}

	// 정적 메서드(static)
	static int total(int[] arr) {
		int total = 0;
		for (int i : arr) {
			total += i;
		}
		// privateMethod(); static메소드에서는 static이 아니면 사용이 불가능
		privateStaticMethod();
		return total;
	}

	// private 메서드
	private void privateMethod() {
		System.out.println("Private Method");
	}
	
	private static void privateStaticMethod() {
		System.out.println("Private Static gMethod");
	}
	
	
	
}
