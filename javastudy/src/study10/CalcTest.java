package study10;

public class CalcTest {
	public static void main(String[] args) {
		Calc calc = new CompleteCalc();
		
		int n1 = 14, n2 = 7;
		
		System.out.println(calc.add(n1, n2));
		System.out.println(calc.sub(n1, n2));
		System.out.println(calc.times(n1, n2));
		System.out.println(calc.div(n1, n2));
		
		n2=0;										
		System.out.println(calc.div(n1, n2));	// ERROR
		
		System.out.println(calc.PI);
		System.out.println(calc.times(n1, (int)calc.PI));
		
		calc.desc();
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Calc.total(arr));  // static 메서드라서 해당하는 인터페이스 명칭을 적어야 함.
		
	}
}
