package study03;

import java.util.ArrayList;

public class ArrayListPrac {

	public static void main(String[] args) {
		
		ArrayList<Integer> number = new ArrayList<>();
		
		for(int i=1;i<=10;i++) {
			number.add(i);
		}
		System.out.println(number);
		
		System.out.println(number.get(2)); // 해당 인덱스를 검색하면 해당 인덱스에 있는 값을 출력해준다.
		System.out.println(number.indexOf(1)); // 찾는 값이 배열에 있으면 해당 인덱스 값을 출력하고, 찾는 값이 배열에 없다면 무조건 -1이 출력됨.
	
		
		
		ArrayList<String> str = new ArrayList<>();
		
		str.add("가");
		str.add("나");
		str.add("다");
		str.add("라");
			

		System.out.println(str);
	}

}
