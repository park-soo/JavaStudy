package study15_2;

import java.util.*;
import java.util.Map.Entry;

public class MapEx {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		// 값 추가
		map.put("lee", 96);
		map.put("hong", 86);
		map.put("song", 92);
		
		String name = "";
		int maxPoint = 0;
		int totalPoint = 0;
		
		// keySet으로

//		for(String s: map.keySet()) {
//			if(map.get(s)>maxPoint) {
//				maxPoint = map.get(s);
//				name = s;
//			}
//				totalPoint += map.get(s);
//		}
		
//		Set<String> keySet = map.keySet();
//		Iterator<String> iter = keySet.iterator();
//		while(iter.hasNext()) {
//			String topName = iter.next();
//			int value = map.get(topName);
//			totalPoint += value;
//			maxPoint = (maxPoint < value)?value:maxPoint;
//			name = (maxPoint <= value )?topName:name;
//		}
		

//		// entrySet으로 
//		for(Entry<String, Integer> s: map.entrySet()) {
//			if(s.getValue()>maxPoint) {
//				maxPoint = s.getValue();
//				name = s.getKey();
//			}
//				totalPoint += s.getValue();
//		}
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> iter = entrySet.iterator();
		while(iter.hasNext()) {
			Entry<String, Integer> entry = iter.next();
			String topName = entry.getKey();
			int point = entry.getValue();
			totalPoint += point;
			maxPoint = (maxPoint<=point)?point:maxPoint;
			name = (maxPoint<=point)?topName:name;
		}

		System.out.println("평균점수: "+totalPoint/map.size());
		System.out.println("최고점수: "+maxPoint);
		System.out.println("최고득점자: "+name);

	}
}


