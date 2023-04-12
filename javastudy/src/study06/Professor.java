package study06;

public class Professor {
	//멤버변수
	String name;
	String attach;
	int classLevel;
	
	// 생성자
	Professor() {	//기본 생성자
		
	}
	
	Professor(String name, String attach, int classLevel) {		// 매개변수가 있는 생성자
		this.name = name;
		this.attach = attach;
		this.classLevel = classLevel;
	}
	
	//메소드(메서드)
	
	//출석 부르기
	void attach(String name) {
		
		 System.out.println("출석체크 할게요: "+name);
	}
	
	//과제 내주기
	String task(String task) {
		
		return task;
	}
	
	// 학점주기
	int grade(int grade) {
		
		return grade;
	}
	
	
	
	
}
