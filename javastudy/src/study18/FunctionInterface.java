package study18;




@FunctionalInterface
public interface FunctionInterface {
	void abMethod();		// 함수형 인터페이스는 메서드가 하나만 ...
}
interface FunctionInterface1{	// input x output x
	void abMethod1();			// 출력, log나 찍는 정도
}
interface FunctionInterface2{	// input x output o
	int abMethod2();
}
interface FunctionInterface3{	// input o output x
	void abMethod3(int i);
}
interface FunctionInterface4{	// input o output o
	double abMethod4(int i, double d);
}



