package study06;

public class CarMain {
	
	// 멤버변수(필드)				// 멤버변수에 값을 굳이 넣지 않아도 됌. 생성자에 초기화(초기값을) 넣어주는게 더 좋다.
	private String name;		// 이름
	private String model;		// 모델
	private int size;			// 크기

	// 생성자
	CarMain() {	//기본 생성자
		
	}
	
	CarMain(String name, String model, int size) {	// 멤버변수를 포함하고 있는 생성자
		this();
		this.name = name;
		this.model = model;
		this.size = size;
	}
	
	// 메소드(메서드)
	int acclerate(int a) {		// 가속하기 accelerate
		return ++a ;
	}
	
	int decelerate(int d) {	// 감속하기 decelerate
		return --d ;
	}
	
	int chGear(int c) {			// 기어변경 chGear
		
		return c;
	}
	
	
	// getter setter
	
	public String getName() {
		return name;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
