package study07;

public class Bus extends Car {
	public static void main(String[] args) {
		
		Bus bus = new Bus();
		
		//bus.carNum; 			// private 외부 클래스 접근 불가능
		int speed = bus.Speed;	// default
		bus.getSpeed();			// protected
		bus.getCarNum();		// public
		
		
	}
}
