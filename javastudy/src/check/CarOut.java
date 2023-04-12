package check;

import study07.Car;

public class CarOut {
	public void carMethod() {
		Car car = new Car();		// 패키지가 다르기 때문에 임포트를 시켜서 생성한다.
		//car.carNum; 			// private 외부 클래스 접근 불가능
		//int speed = car.Speed;	// default
		//car.getSpeed();			// protected
		car.getCarNum();		// public
		
		
	}
}
