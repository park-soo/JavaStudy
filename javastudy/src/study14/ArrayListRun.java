package study14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListRun {
	public static void main(String[] args) {

		// 객체를 생성

		ArrayList<String> alist = new ArrayList<>();

		// List를 상속 받고 있어서 가능함.
		List<String> list = new ArrayList<>();

		// 요소 추가
		alist.add("태종");
		alist.add("승진");
		alist.add("주환");
		alist.add(1, "소정");
		alist.add(2, "영화");
		System.out.println(alist);

		// 요소 읽기
		System.out.println(alist.get(1));

		// 요소 삭제
		System.out.println(alist.remove(2)); // 값이 없어졌지만, 반환값으로 돌려주기도 함.
		System.out.println(alist);
		System.out.println(alist.remove("태종")); // 반환값이 지우고 싶은 값이 있으면true, 없으면 false로 돌려줌.
		System.out.println(alist);

		// 요소 수정
		alist.set(2, "태일");
		System.out.println(alist);

		// 요소의 개수
		System.out.println(alist.size());

		// 요소의 검색
		System.out.println(alist.contains("승진"));
		System.out.println(alist.indexOf("소정"));

		// 반복 for문
		for (int i = 0; i < alist.size(); i++) {
			System.out.print(alist.get(i) + " ");
		}

		System.out.println();
		// 반복 향상된 for문
		for (String str : alist) {
			System.out.print(str + " ");
		}

		System.out.println();
		System.out.println();

		// 반복 Iterator
		Iterator<String> iter = alist.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}

		System.out.println();

		// 전체 삭제
		alist.clear();
		System.out.println(alist);

		// 배열 정렬(sorting)
		alist.add("예진");
		alist.add("민성");
		alist.add("현우");
		alist.add("시우");
		alist.add("지민");
		alist.add("정기");
		System.out.println(alist);
		Collections.sort(alist); // ㄱ ㄴ ㄷ 순으로 순서 변경
		System.out.println(alist);
		Collections.sort(alist, Collections.reverseOrder()); // 역순으로 변경
		System.out.println(alist);

		// 한번에 추가
		ArrayList<String> alist2 = new ArrayList<>(Arrays.asList("예진", "민성", "현우", "시우", "지민", "정기"));
		System.out.println(alist2);

		ArrayList<String> alist3 = new ArrayList<>(List.of("예진", "민성", "현우", "시우", "지민", "정기"));
		System.out.println(alist3);

	}
}
