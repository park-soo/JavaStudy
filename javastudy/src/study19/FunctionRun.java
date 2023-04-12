package study19;

import java.util.function.*;

public class FunctionRun {
	public static void main(String[] args) {
		Function<String, Integer> func	= new Function<String, Integer>() {
			
			@Override
			public Integer apply(String t) {
				
				return t.length();
			}
		};
		System.out.println(func.apply("몇 개일까용?"));
		
		
		Function<String, Integer> func2 = str -> str.length();
		System.out.println(func2.apply("글 자 수 는 몇 개 일 까 요 ~ ?"));
		
		Function<String, Integer> func3 = String::length;
		System.out.println(func3.apply("글 자 수 는 몇 개 일 까 요 ~ ?????"));
		
		IntFunction<Double> ifd = num->num*1.3;		//	 입력값 int , 출력값 double
		System.out.println(ifd.apply(3));
	
		LongFunction<String> lfs = num -> String.valueOf(num);
		System.out.println(lfs.apply(12L));
		
		DoubleFunction<Integer> dfi = num -> (int)num;
		System.out.println(dfi.apply(10.323));
		
		//입력 값을 2개 받는 
		BiFunction<String, String, String> bft = (addr1, addr2) -> addr1+" "+addr2; 
		System.out.println(bft.apply("서울시", "용산구"));
		
		
		LongToDoubleFunction ltd = num->num;
		System.out.println(ltd.applyAsDouble(12L));
		LongToIntFunction lti = num ->(int)num;
		System.out.println(lti.applyAsInt(1234L));
		
		ToIntFunction<String> tis = str -> str.length();
		System.out.println(tis.applyAsInt("이건 길이가 ??"));

		
		ToDoubleBiFunction<Integer, Double> tbf = (intNum, doubleNum) -> intNum*doubleNum;
		System.out.println(tbf.applyAsDouble(12, 12.232));
		
		
		
		
		
		
		
	}
}
