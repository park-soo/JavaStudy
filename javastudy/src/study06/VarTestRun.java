package study06;

public class VarTestRun {
	
	int k = 0;

	int localVal(int l) {
		this.k++;
		
		return ++l; // ++위치에 따라 값이 변함.
	}
	
	
	public static void main(String[] args) {
		int a= 1;
		
		//사용할 메소드를 포함한 클래스의 객체를 생성
		VarTestRun vtr = new VarTestRun();
		
		a=vtr.localVal(a);
		
		System.out.println(a);
		//객체.멤버변수명
		System.out.println(vtr.k);
		
		
		int number = 1;
    	System.out.println(number++);  // 1를 출력해주고 2가 된 상태
    	System.out.println(++number);  // 2를 먼저 더하고 출력을 해주기 때문에 3으로 출력됨.
		
		
	}
	
}


