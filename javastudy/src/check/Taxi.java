package check;

import study07.Car;

public class Taxi extends Car {

	Taxi() {
		super();
		
		//this.carNum;				// private
		//int speed = this.Speed;		// default 			// 다른 패키지 임으로 접근 불가.
		this.getSpeed();			// protected		// 다른 패키지이지만, 상속을 받았기때문에 접근이 가능.
		this.getCarNum();			// public
			
	}
	
	
	
	
	
}
