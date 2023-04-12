package study13;

public class UtilBox {		//일반 클래스
	
	// generic method
	public <T> T boxing(T t) {
		return t;
	}

	public <T> boolean boxing(T t1, T t2) {
		return t1.equals(t2);
	}
	
	public <K,V> void boxing2(K k, V v) {
		System.out.println(k+" "+v);
	}
	
	//	length() 쓸 수 있게 할려면, String을 상속받아서 진행.
	public <T extends String> void boxing3 (T t ) {
		System.out.println(t.length());
	}

	// 일반적인 generic 조건에서는 Object Method만 사용 가능
	// 사용가능한 generic 조건으로 변경하면 해당 Method도 사용 가능
	
	
	
	
}
