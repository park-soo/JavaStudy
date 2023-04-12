package study13;

/*
 * Generic(제너릭)
 * 1. 컴파일 타입 체크
 * 2. 형변환이 불필요
 * 3. 코드 재사용성이 유리
 * 4. T-type	E-element	K-key	V-value		N-number	
 */

// 제너릭 클래스
class GenericClass<T> {
	private T dataType; 				// 제너릭 타입 변수

	void setDataType(T dataType) {		//제너릭 매개 변수
		this.dataType = dataType;
	}

	T getDataType() {					//제너릭 타입 반환
		return dataType;
	}
	
	//제너릭 메서드
	static <V> V genericMethod1(V value){
		return value;
		
	}
	
//   ↓ 가리키는 T는 클래스 T와는 전혀 다른 T 별개로 작용.
	<T> T genericMethod2(T value) {
		return value;
	}

}


class GenericClass2<K,V>{
	private K first;
	private V second;
	
	void set (K fist, V second) {
		this.first = fist;
		this.second = second;
	}
	
	K getFirst() {
		return first;
	}
	V getSecond() {
		return second;
	}
	
	
}


public class GenericRun {
	public static void main(String[] args) {
		
		GenericClass<String> a = new GenericClass<>();
		GenericClass<Integer> b = new GenericClass<>();
		
		a.setDataType("10");
		b.setDataType(10);
		
		System.out.println(a.getDataType());
		System.out.println(b.getDataType());
		System.out.println(a.getDataType().getClass().getName());
		System.out.println(b.getDataType().getClass().getName());
		
		GenericClass2<String, Integer> c = new GenericClass2<>();
		
		c.set("11", 12);
		
		System.out.println(c.getFirst());
		System.out.println(c.getSecond());
		
		//generic Method
		System.out.println(a.genericMethod2(3));
		System.out.println(a.genericMethod2("문자열"));
		System.out.println(a.genericMethod2(b));
		
		// 제네릭 메서드에 static을 선언 시 아래와 같이 출력 가능 객체를 생성 안해도 됨~
		System.out.println(GenericClass.genericMethod1("정적"));
		
	}
	
	
	
}
