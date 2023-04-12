package study19;

import java.util.function.*;

public class OperatorRun {
	public static void main(String[] args) {
		UnaryOperator<Double> uo = new UnaryOperator<Double>() {			//매개변수를 1개
			
			@Override
			public Double apply(Double t) {
				return t*12.3;
			}
		};					
		System.out.println(uo.apply(3.4));
		
		BinaryOperator<String> bo = new BinaryOperator<String>() {			//매개변수를 2개	
			
			@Override
			public String apply(String t, String u) {
				return t+u;
			}
		};					
		System.out.println(bo.apply("어서", "오세요"));
		
		
		UnaryOperator<Double> uo2 = dd -> dd*12.3;
		System.out.println(uo2.apply(2.2));

		BinaryOperator<String> bo2 = (str1, str2) -> str1+str2; 
		System.out.println(bo2.apply("Hello", "World"));
		
		
		IntUnaryOperator iuo = num -> num+3;
		System.out.println(iuo.applyAsInt(10));
		LongUnaryOperator luo = num->num+21L;
		System.out.println(luo.applyAsLong(20L));
		DoubleUnaryOperator duo = num -> num*1.2;
		System.out.println(duo.applyAsDouble(3.5));
		
		IntBinaryOperator ibo = (num1,num2)->num1-num2;
		System.out.println(ibo.applyAsInt(20, 10));
		LongBinaryOperator lbo = (num1,num2)-> num1-num2;
		System.out.println(lbo.applyAsLong(20L, 100L));
		DoubleBinaryOperator dbo = (num1,num2)->num1-num2;
		System.out.println(dbo.applyAsDouble(12.3, 12.54));
		
		
		
		
		
	}
}
