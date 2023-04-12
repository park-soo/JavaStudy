package study19;

import java.util.function.*;

public class ConsumerRun {
	public static void main(String[] args) {
		Consumer<String> c = new Consumer<String>() {		
			
			@Override
			public void accept(String t) {			// 입력만 있기때문에 출력부분에서는 void 
				System.out.println(t);
				
			}
		};
		c.accept("하이");
		Consumer<String> c2 = t -> System.out.println(t);
		Consumer<String> c3 = System.out::println;
		
		c3.accept("바이");
		
		
		IntConsumer c4 = num->System.out.println(num);
		LongConsumer c5 = num->System.out.println(num);
		DoubleConsumer c6 = num->System.out.println(num);
		BiConsumer<String, Integer> c7 = (name, age)->System.out.println(name+age);
		
		c7.accept("벌써 피곤하다", 99);
		c6.accept(23.293);
		c5.accept(149879124);
		c4.accept(102);
		
		
		
	}
}
