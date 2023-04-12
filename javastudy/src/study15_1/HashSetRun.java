package study15_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetRun {
	public static void main(String[] args) {
		
	//객체 생성
	Set<String> hset1 = new HashSet<>();
	HashSet<String> hset2 = new HashSet<>();
	
	//추가
	hset1.add("일식이");
	hset1.addAll(Arrays.asList("esick","samsick","sasick","osick"));
	
	//다른 객체로 이동
	hset2.addAll(hset1);
	
	//반복				// 일반for문은 인덱스도 없고, 순서도 없고 그래서 안됌.
	Iterator<String> iter = hset2.iterator();
	while(iter.hasNext()) {
		System.out.print(iter.next()+" ");
	} System.out.println();
	
	for (String str : hset2) {
	    System.out.print(str+" ");
	} System.out.println();
	
	
	// 삼식이 있는지 확인하고 있으면 구식이 추가, 없으면 오식이 삭제
	if(hset2.contains("samsick")) {
		hset2.add("gusick");
	} else {
		hset2.remove("osick");
	} 
	System.out.println(hset2);
	

	//배열로 변환해서 반복문 출력
	String[] strArr = hset2.toArray(new String[0]);
	for(String str: strArr) {
		System.out.print(str+" ");
	}	System.out.println();
	
	
	
	
	
	}
}
