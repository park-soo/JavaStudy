package test1;

import java.util.ArrayList;
import java.util.Arrays;

class Calculator {
	int value;

	Calculator() {
		this.value = 0;
	}

	void add(int val) {
		this.value += val;
	}

	int getValue() {
		return value;
	}
	
	boolean isEven(int even) {
		// return even%2==0 && even!=0; // boolean 은 굳이 if를 쓸 필요가 없당.
		if(even%2==0 && even!=0) {
			return true;
		}  else {
			return false;
		}
	}
	
	public double avg(int[] data1) {
		double avg = 0;
		for(int s : data1) {
			avg += s;
			
		}
		return avg/data1.length;
	}
	
	public double avg(ArrayList<Integer> data2) {
		double avg = 0;
		
		for(int s : data2) {
			avg += s;
			
		}
		return avg/data2.size();
	}
	
	
	
}

class UpgradeCalculator extends Calculator {

	void minus(int val) {
		value -= val;
	}

}

class MaxLimitCalculator extends Calculator {

	int max = 0;

	public MaxLimitCalculator(int max) {
		this.max = max;
	}

	@Override
	void add(int val) {
		value += val;
		if (value > max) {
			value = max;
		}
	}

}

public class Exam08 {
	public static void main(String[] args) {

		Calculator cal1 = new Calculator();
		cal1.add(10);
		System.out.println(cal1.getValue());

		UpgradeCalculator cal2 = new UpgradeCalculator();
		cal2.add(10);
		cal2.minus(7);
		System.out.println(cal2.getValue()); // 3

		MaxLimitCalculator cal3 = new MaxLimitCalculator(100);
		cal3.add(50);
		cal3.add(10);
		cal3.add(20);
		System.out.println(cal3.getValue()); // 100

		Calculator cal4 = new Calculator();
		System.out.println(cal4.isEven(3)); // 짝수여부 판단 false
		System.out.println(cal4.isEven(4)); // 짝수여부 판단 true
		System.out.println(cal4.isEven(0)); // 짝수여부 판단 false
		
		Calculator cal5 = new Calculator();
		
		int[] data1 = {1,3,5,7,9,10};
		System.out.println((int)Math.round(cal5.avg(data1)));	// 5
		
		ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1,3,5,7,9,10));
		System.out.println(cal5.avg(data2));	// 5
		

		

	}
}
