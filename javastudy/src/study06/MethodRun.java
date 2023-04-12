package study06;

public class MethodRun {
	
	
	//매개변수는 없고, 반환값이 있는 경우
	String sayHi(){
		return "Hi!";
	}
	
	//매개변수는 있고, 반환값이 없는 경우
	void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	// return;
	
	void sayNickname(String nick) {
		if("asshole".equals(nick)) {
			return;  // 동일하면 그냥 나가버린다.
		} else {
			System.out.println("My Nickname is "+nick);
		}
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		// 기본생성자가 기본적으로 눈에는 안보이지만 생성되어 있다.
		
		
		//사용할 메소드를 포함한 클래스의 객체를 생성
		MethodRun mr = new MethodRun();	// 객체를 만들어 준다.(static이 없기 때문에 객체를 만들어야 메소드를 쓸 수 있음)
		
		//해당 메소드 호출
	    //반환값 변수명 = 객체.메소드명(); 		// 파라미터가 있다면 작성해야함.
		String res =mr.sayHi();			// 객체가 만들어 졌기때문에 메소드를 쓸 수 있당. 
		System.out.println(res);
		
		//반환값이 없는 경우 객체.메소드명(); 만 작성
		mr.sum(3, 2);
		
		mr.sayNickname("asshole1"); 
		
		
		
	}
}
