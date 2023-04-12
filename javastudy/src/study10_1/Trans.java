package study10_1;

public abstract class Trans {

	int passengerCount; 	// 승객숫자
	int income; 			// 총 수익

	public void take(int money) { 	// 승객이 해당 교통수단을 이용했을 때
		passengerCount++;
		income += money;
	}

	public abstract void showInfo();

}
