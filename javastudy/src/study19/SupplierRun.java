package study19;

import java.util.function.*;

public class SupplierRun {
	public static void main(String[] args) {
		Supplier<String> s = new Supplier<String>() {
			
			@Override
			public String get() {
				
				return "Supplier 반환";
			}
		};
		System.out.println(s.get());
		
		Supplier<String> s2 = ()-> {return "반환 값";};
		Supplier<String> s3 = ()-> "반환 값";
		System.out.println(s3.get());
		
		
		BooleanSupplier bs = () -> {return(3>2);};		//결과 값이 boolean 값
		IntSupplier is =() -> 12+3;						//
		LongSupplier ls =() ->23L;		
		DoubleSupplier ds =() ->12.43;
		
		System.out.println(bs.getAsBoolean());
		System.out.println(is.getAsInt());
		System.out.println(ls.getAsLong());
		System.out.println(ds.getAsDouble());
		
		
		// Bi 는 없음. 입력값이 없기때문에 2개의 인자고 자시고 필요 없음.
		
		
	}
}
