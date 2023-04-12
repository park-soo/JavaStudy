package study15_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListPrac {
	public static void main(String[] args) {
		
		//객체
		ArrayList<String> al = new ArrayList<>();
		
		//내용	// 추가 일식이....칠식이....
		al.add("일식이");
		al.add("이식이");
		al.addAll(Arrays.asList("삼식이","사식이","오식이","육식이","칠식이"));
		//al.addAll(List.of("삼식이","사식이","오식이","육식이","칠식이"));
		System.out.println(al);
		
		//반복 구문 출력
		//일반 for문
		for(int i=0; i<al.size(); i++) {
			System.out.print(al.get(i)+" ");
		}
		
		System.out.println();
		
		//향상된 for문
		for(String str : al) {
			System.out.print(str+" ");
		}
		
		System.out.println();
		
		Iterator<String> iter = al.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		
		System.out.println();
		
		// 삼식이 있는지 확인하고 있으면 구식이 추가, 없으면 오식이 삭제
		if(al.contains("삼식이")) {
			al.add("구식이");
		} else {
			al.remove("오식이");
		}
		System.out.println(al);
		
//		if(al.indexOf("삼식이")>=0) {
//			al.add("구식이");
//		} else {
//			al.remove("오식이");
//		}
		

		
		//배열로 변환해서 반복문 출력
		String[] sarr =  al.toArray(new String[0]);
		
		for(String str : sarr) {
			System.out.print(str+" ");
		} System.out.println();
		
		
		
		
	}
}
