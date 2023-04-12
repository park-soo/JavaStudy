package study04;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("몸무게 입력(kg) : ");
		double weight = input.nextDouble();
		System.out.print("키 입력(m) : ");
		double tall = input.nextDouble()/100;
		//BMI 지수 계산
		double bmi = calculateBMI(weight,tall);
		//BMI 지수로 비만도 결과 출력
		printBMIClassificaion(bmi);
		
		
		
		
	}

	public static double calculateBMI(double weight, double tall) {
		return weight/Math.pow(tall, 2);
		
	}
		
	
	public static void printBMIClassificaion(double bmi) {
		String bmiClass = "";
		
		if (bmi>=30) {
			bmiClass="비만";
		} else if (30>bmi&&bmi>=25) {
			bmiClass="과체중";
		} else if (25>bmi&&bmi>=18.5) {
			bmiClass="정상";
		} else {
			bmiClass="저체중";
		}
		
		System.out.printf("BMI: %.2f %n%s 입니다.",bmi,bmiClass);
		
	}
	

}
