package study03;

import java.util.ArrayList;

public class ArrayListRun {
	public static void main(String[] args) {
		//class 객체로 생성
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<>(); 		//Integer 생략 가능
		ArrayList<Integer> list3 = new ArrayList<>(10); 	// 기본사이즈 설정 가능
		
		ArrayList<String> strList = new ArrayList<>();
		strList.add("반장");
		strList.add("Hi");
		strList.add("Good");
		System.out.println(strList);
		System.out.println(strList.size());
		System.out.println(list3.size());
		
		
		strList.add(1, "메가커피");	// inserts 기존 인덱스 값을 뒤로 미루고 추가가 된당.(추가)
		System.out.println(strList);
		System.out.println(strList.size());
		strList.set(2, "바꿔볼까"); 	// replaces 기존 인덱스 값을 삭제하고 추가가 된당.(수정)
		System.out.println(strList);
		strList.remove("반장"); 		// 동일객체 삭제
		System.out.println(strList);
		System.out.println(strList.size());
		strList.remove(2); 			// 해당 인덱스의 값 삭제
		System.out.println(strList);
		strList.clear();			// 해당 배열 값 다 삭제
		System.out.println(strList);
		
		strList.add("홍길동");
		strList.add("이순신");
		strList.add("홍길순");
		strList.add("아무개");
		System.out.println(strList);
		
		for(int i=0;i<strList.size();i++) {
			System.out.print(strList.get(i)+" ");
			
		}
		System.out.println();
		
		for(String k : strList) {
			System.out.print(k+ " ");
		}
		System.out.println();
		
		//검색
		System.out.println(strList.contains("홍길동"));
		System.out.println(strList.indexOf("아무개")); // 찾는 값이 배열에 있으면 해당 인덱스 값을 출력하고, 찾는 값이 배열에 없다면 무조건 -1이 출력됨.
		System.out.println(strList.indexOf("배열에 없는")); // 찾는 값이 배열에 있으면 해당 인덱스 값을 출력하고, 찾는 값이 배열에 없다면 무조건 -1이 출력됨.
	
		//복사
		System.out.println(strList);
		//Clone()
		ArrayList<String> newStr1 = (ArrayList<String>)strList.clone(); // strList.clone() object타입으로 형 변환을 시켜야 함. 
		printArrayList(newStr1);
		
		System.out.println();
		
		//addAll()
		ArrayList<String> newStr2 = new ArrayList<>();
		newStr2.addAll(strList);
		printArrayList(newStr2);
		
		System.out.println();
		
		//향상된 for문 
		ArrayList<String> newStr3 = new ArrayList<>();
		for(String Str : strList) {
			newStr3.add(Str);
		}
		printArrayList(newStr3);
		
		System.out.println();
		
		//isEmpty() 비어있는지 확인 결과값은 boolean
		System.out.println(newStr3.isEmpty());
		newStr3.clear();
		System.out.println(newStr3.isEmpty());
				
		
	}
	//배열 -> 문자열로 변환
	static void printArrayList(ArrayList<String> arr) {
		for(String str : arr) {
			System.out.print(str+ " ");
		}

	}
	
	
	
	
	
	
	
	
}
