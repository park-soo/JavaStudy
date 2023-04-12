package study07;

public class CarTest {
	public static void main(String[] args) {
		Car car = new Car();
		//car.carNum; 			// private 외부 클래스에서 접근 불가능
		int speed = car.Speed;	// default 같은 패키지 접근 가능
		car.getSpeed();			// protected 같은 패키지 접근 가능 
		car.getCarNum();		// public 어디든 가능
		
	
	}
}
