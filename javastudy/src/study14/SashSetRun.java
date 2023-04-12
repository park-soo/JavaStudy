package study14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class SashSetRun {
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<>();
		hs.add("홍길동");
		hs.addAll(Arrays.asList("이순신","유관순","김구"));
		System.out.println(hs);
		System.out.println(hs.size());
		hs.add("김구");
		System.out.println(hs);	
		System.out.println(hs.size());
		hs.add(null);
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.contains("이순신"));		// HashSet은 인덱스가 없어서 index관련된 메서드는 안됌.
		System.out.println(hs.remove("홍길동"));
		System.out.println(hs);
		hs.clear();
		System.out.println(hs.isEmpty());
		
		
		HashSet<String> hs2 = new HashSet<>(Arrays.asList("홍길동","유관순","유관순","김구","이순신"));
		
		System.out.println(hs2);
		
		Iterator<String> iter = hs.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		String[] strArr = hs2.toArray(new String[0]);
		System.out.println(Arrays.toString(strArr));
		
		
		//arraylist -> hashset바꾸기.  //중복제거
		
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4));
		HashSet<Integer> hs1 = new HashSet<>(arr);
		System.out.println(hs1);
		
	}
}
