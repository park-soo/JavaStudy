package study02_1;

import study02.Car;

public class CarTest {

	public static void main(String[] args) {
		Car c = new Car();
		//c.carNum; // private 접근제어자를 사용하여 접근 불가
		//int speed = c.speed; //default
		//c.getSpeed(); // protected
		c.getCarNum(); // public
		

	}

}
