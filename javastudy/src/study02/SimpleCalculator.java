package study02;



class Calculator {
	// 생성자 -> 객체 생성
	Calculator(){}; // 작성 하지 않아도 컴파일러가 알아서 작성해준다고 함.
	
	// 필드 -> 속성 값
	private int result=0;
	static int memory=3; // static를 사용하여 공용으로 사용하는 저장공간에 따로 저장되어 생성자(cal1, cal2)가 다르더라도 동일한 값이 출력 된다.(생성자 또한 cal1, cal2 -> Calculator )

	
	// 메소드 -> 기능
	int add(int num) {
		result += num;
		return result;
		
	}
	
}




public class SimpleCalculator {

	public static void main(String[] args) {
		
		Calculator cal1 = new Calculator();
		System.out.println(cal1);
		Calculator cal2 = new Calculator();
		System.out.println(cal2);
		//System.out.println(cal1.result);// private를 사용함으로써 같은 클래스가 아니므로 사용 못함.
		System.out.println(cal1.add(5));
		//System.out.println(cal2.result);
		System.out.println(cal1.memory);
		System.out.println(cal2.memory);
		cal1.memory=10; // static를 사용하여 공용으로 사용하는 저장공간에 따로 저장되어 생성자(cal1, cal2)가 다르더라도 동일한 값이 출력 된다.(생성자 또한 cal1, cal2 -> Calculator )
		System.out.println(Calculator.memory);
		System.out.println(Calculator.memory);
		
		
	}

}

