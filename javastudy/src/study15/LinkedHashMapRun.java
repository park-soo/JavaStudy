package study15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapRun {
	public static void main(String[] args) {

		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>();
		// 추가
		lmap.put(2, "홍길동");
		lmap.put(4, "김유신");
		lmap.put(3, "유관순");
		lmap.put(1, "이순신");
		System.out.println(lmap.toString());

		HashMap<Integer, String> lmap2 = new HashMap<>();
		lmap2.putAll(lmap);
		lmap2.putAll(lmap); // key값이 중복이 안되기 때문에 동일한 값으로 나옴.
		System.out.println(lmap2);
		lmap.put(1, "이방원"); // 나중에 들어온 값이 덮어씌움.
		lmap2.putAll(lmap);
		System.out.println(lmap2);

		lmap.putIfAbsent(5, "무지개");
		lmap.putIfAbsent(3, "무지개");
		System.out.println(lmap);

		// 수정
		lmap.replace(3, "김구"); // key 값만 비교
		lmap.replace(9, "김구"); // 9 key 값이 없으므로 변경된 내용이 없음.
		System.out.println(lmap);

		// 읽기
		System.out.println(lmap.get(3)); // 해당하는 key값에 있는 value값 출력해줌.
		System.out.println(lmap.getOrDefault(100, "기본값")); // 해당 key값이 있으면 key값에 해당하는 value값을 출력해주고, key값이 없으면 "기본값"
															// 출력해줌.

		Set<Map.Entry<Integer, String>> entrySet = lmap.entrySet();
		System.out.println(entrySet.toString());

		Set<Integer> keySet = lmap.keySet(); // Set의 형태로
		System.out.println(keySet);
		System.out.println(lmap.values()); // Collection의 형태로

		// 개수
		System.out.println(lmap.size());

		// 조회
		System.out.println(lmap.containsKey(4));
		System.out.println(lmap.containsKey(7));
		System.out.println(lmap.containsValue("김구"));
		System.out.println(lmap.containsValue("임꺽정"));

		// 삭제
		System.out.println(lmap.remove(4));
		System.out.println(lmap.remove(2, "임꺽정")); // key값 조회 후 value값이 맞으면 지우고, 아니면 안 지움.
		System.out.println(lmap);

		lmap.clear();
		System.out.println(lmap.isEmpty());

		// 반복
		Set<Integer> kSet = lmap2.keySet();
		for (Integer key : kSet) {
			System.out.printf("키:%d 값:%s  ", key, lmap2.get(key));
		}
		System.out.println();

		Iterator<Integer> keys = kSet.iterator();
		while (keys.hasNext()) {
			Integer key = keys.next();
			System.out.printf("키:%d 값:%s  ", key, lmap2.get(key));
		}

	}
}
