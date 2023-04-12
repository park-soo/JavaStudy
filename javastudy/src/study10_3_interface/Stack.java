package study10_3_interface;

public interface Stack {
	int length();					// 현재 스텍에 저장된 개수
	int capacity();					// 스택의 전체 저장 가능한 개수
	String pop();					// 스택의 맨 위에 저장된 값 반환
	boolean push(String value);		// 스택의 맨 위쪽에 값 저장
}
