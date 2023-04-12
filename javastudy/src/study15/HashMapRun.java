package study15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapRun {
	public static void main(String[] args) {
		
		HashMap<Integer, String> hmap = new HashMap<>();
		//추가
		hmap.put(2, "홍길동");
		hmap.put(4, "김유신");
		hmap.put(3, "유관순");
		hmap.put(1, "이순신");
		System.out.println(hmap.toString());
		
		
		HashMap<Integer, String> hmap2 = new HashMap<>();
		hmap2.putAll(hmap);
		hmap2.putAll(hmap);				// key값이 중복이 안되기 때문에 동일한 값으로 나옴.
		System.out.println(hmap2);
		hmap.put(1, "이방원");			// 나중에 들어온 값이 덮어씌움.
		hmap2.putAll(hmap);
		System.out.println(hmap2);
		
		
		hmap.putIfAbsent(5, "무지개");
		hmap.putIfAbsent(3, "무지개");
		System.out.println(hmap);
		
		//수정
		hmap.replace(3, "김구");		// key 값만 비교
		hmap.replace(9, "김구");		// 9 key 값이 없으므로 변경된 내용이 없음.
		System.out.println(hmap);
		
		//읽기
		System.out.println(hmap.get(3));						// 해당하는 key값에 있는 value값 출력해줌. 
		System.out.println(hmap.getOrDefault(100, "기본값"));		//해당 key값이 있으면 key값에 해당하는 value값을 출력해주고, key값이 없으면 "기본값" 출력해줌.

		
		Set<Map.Entry<Integer, String>> entrySet = hmap.entrySet();
		System.out.println(entrySet.toString());
		
		Set<Integer> keySet = hmap.keySet();		//Set의 형태로 
		System.out.println(keySet);
		System.out.println(hmap.values());			//Collection의 형태로
		
		//개수
		System.out.println(hmap.size());
		
		//조회
		System.out.println(hmap.containsKey(4));
		System.out.println(hmap.containsKey(7));
		System.out.println(hmap.containsValue("김구"));
		System.out.println(hmap.containsValue("임꺽정"));
		
		//삭제
		System.out.println(hmap.remove(4));
		System.out.println(hmap.remove(2,"임꺽정"));				//key값 조회 후 value값이 맞으면 지우고, 아니면 안 지움.
		System.out.println(hmap);
		
		hmap.clear();
		System.out.println(hmap.isEmpty());
		
		//반복
		Set<Integer> kSet = hmap2.keySet();
		for(Integer key : kSet) {
			System.out.printf("키:%d 값:%s  ",key,hmap2.get(key));
		}
		System.out.println();
		
		Iterator<Integer> keys = kSet.iterator();
		while(keys.hasNext()) {
			Integer key = keys.next();
			System.out.printf("키:%d 값:%s  ",key,hmap2.get(key));
		}
		

		
	}
}
