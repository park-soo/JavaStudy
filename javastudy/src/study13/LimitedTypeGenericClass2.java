package study13;

interface TestInterFace {
	public abstract void test();

}

class SubClass implements TestInterFace {
	@Override
	public void test() {
		System.out.println("subClass test() run");

	}
}

class NormalClass {
	public <T extends TestInterFace> void genericMethod(T t) {
		t.test();
	}
}

public class LimitedTypeGenericClass2 {
	public static void main(String[] args) {

		NormalClass nc = new NormalClass();
		nc.genericMethod(new SubClass()); // 하위 클래스 생성

		SubClass sc = new SubClass();
		sc.test();

		nc.genericMethod(new TestInterFace() { // 익명 클래스 생성

			@Override
			public void test() {
				System.out.println("anonymousClass test() run");

			}
		});

	}
}
