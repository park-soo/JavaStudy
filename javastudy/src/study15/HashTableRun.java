package study15;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableRun {
	public static void main(String[] args) {
		
		Hashtable<Integer, String> htable = new Hashtable<>();
		
		//추가
				htable.put(2, "홍길동");
				htable.put(4, "김유신");
				htable.put(3, "유관순");
				htable.put(1, "이순신");
				System.out.println(htable.toString());
				
				
				HashMap<Integer, String> htable2 = new HashMap<>();
				htable2.putAll(htable);
				htable2.putAll(htable);				// key값이 중복이 안되기 때문에 동일한 값으로 나옴.
				System.out.println(htable2);
				htable.put(1, "이방원");			// 나중에 들어온 값이 덮어씌움.
				htable2.putAll(htable);
				System.out.println(htable2);
				
				
				htable.putIfAbsent(5, "무지개");
				htable.putIfAbsent(3, "무지개");
				System.out.println(htable);
				
				//수정
				htable.replace(3, "김구");		// key 값만 비교
				htable.replace(9, "김구");		// 9 key 값이 없으므로 변경된 내용이 없음.
				System.out.println(htable);
				
				//읽기
				System.out.println(htable.get(3));						// 해당하는 key값에 있는 value값 출력해줌. 
				System.out.println(htable.getOrDefault(100, "기본값"));		//해당 key값이 있으면 key값에 해당하는 value값을 출력해주고, key값이 없으면 "기본값" 출력해줌.

				
				Set<Map.Entry<Integer, String>> entrySet = htable.entrySet();
				System.out.println(entrySet.toString());
				
				Set<Integer> keySet = htable.keySet();		//Set의 형태로 
				System.out.println(keySet);
				System.out.println(htable.values());			//Collection의 형태로
				
				//개수
				System.out.println(htable.size());
				
				//조회
				System.out.println(htable.containsKey(4));
				System.out.println(htable.containsKey(7));
				System.out.println(htable.containsValue("김구"));
				System.out.println(htable.containsValue("임꺽정"));
				
				//삭제
				System.out.println(htable.remove(4));
				System.out.println(htable.remove(2,"임꺽정"));				//key값 조회 후 value값이 맞으면 지우고, 아니면 안 지움.
				System.out.println(htable);
				
				htable.clear();
				System.out.println(htable.isEmpty());
				
				//반복
				Set<Integer> kSet = htable2.keySet();
				for(Integer key : kSet) {
					System.out.printf("키:%d 값:%s  ",key,htable2.get(key));
				}
				System.out.println();
				
				Iterator<Integer> keys = kSet.iterator();
				while(keys.hasNext()) {
					Integer key = keys.next();
					System.out.printf("키:%d 값:%s  ",key,htable2.get(key));
				}
	}
}
