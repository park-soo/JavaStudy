package study14;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetRun {							// 대소비교가 가능함!! 이진트리 나보다 큰지 작은지가 가능함.
	public static void main(String[] args) {
		TreeSet<String> tset1 = new TreeSet<>();
		tset1.add("apple");
		tset1.add("orange");
		tset1.add("banana");
		System.out.println(tset1);
		
		TreeSet<Integer> tset2 = new TreeSet<>();
		tset2.add(55);
		tset2.add(7);
		tset2.add(32);
		System.out.println(tset2);
		tset1.addAll(tset1);
		System.out.println(tset1);
		tset2.clear();
		System.out.println(tset2.isEmpty());
		
		for(int i=3;i<100;i+=3) {
			tset2.add(i);
		}
		System.out.println(tset2);
		
		System.out.println(tset2.first());			//3		가장 작은 값 
		System.out.println(tset2.last());			//99	가장 큰 값 
		System.out.println(tset2.lower(51));		//48	51보다 작은 값
		System.out.println(tset2.higher(51));		//54	51보다 큰 값
		System.out.println(tset2.floor(17));		//15	작거나 같은경우(17이 없으니까 15 출력)
		System.out.println(tset2.floor(18));		//18	작거나 같은경우(18은 있으니까 18 출력)
		System.out.println(tset2.ceiling(25));		//27	크거나 같은경우(25가 없으니까 27 출력)
		System.out.println(tset2.ceiling(24));		//24	크거나 같은경우(24가 있으니까 24 출력)
		System.out.println(tset2.size());
		System.out.println(tset2.pollFirst());		//3		가장 작은 값을 반환해주고 삭제함.
		System.out.println(tset2.pollLast());		//9		가장 큰 값을 반환해주고 삭제함.
		System.out.println(tset2);
		
		System.out.println(tset2.headSet(18));			//[6,9,12,15] 			18을 포함하지 않은 상태에서 앞 쪽 값을 가져온다. //기본값이 false
		System.out.println(tset2.headSet(18,true));		//[6,9,12,15,18]		18을 포함한 상태에서 앞 쪽 값을 가져온다. 
		System.out.println(tset2.tailSet(84));			//[84, 87, 90, 93, 96]	84을 포함한 상태에서 뒤 쪽 값을 가져온다.  //기본값이 true
		System.out.println(tset2.tailSet(84,false));	//[87, 90, 93, 96]		84을 포함하지 않은 상태에서 뒤 쪽 값을 가져온다.
		System.out.println(tset2.subSet(42, 54));
		System.out.println(tset2.subSet(42, true,54,true));
		
		TreeSet<String> animalTSet = new TreeSet<>(Arrays.asList("Dog","Cat","Tiger","Lion","Elephant","Zebra"));
		SortedSet<String> sset = animalTSet.headSet("Z");
		NavigableSet<String> nset = animalTSet.headSet("Z", true);
		System.out.println(sset);
		System.out.println(nset);
		System.out.println(nset.descendingSet());			//역순
		
		Iterator<String> iter = nset.descendingIterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		
		System.out.println(tset1.remove("apple"));
		System.out.println(tset1);
		
		Iterator<Integer> itr2 = tset2.iterator();
		while(itr2.hasNext()) {
			System.out.print(itr2.next()+" ");
		}
		
		System.out.println();
		
		Iterator<Integer> itr3 = tset2.descendingIterator();
		while(itr3.hasNext()) {
			System.out.printf("%d ",itr3.next());
		}
		
		System.out.println();
		
		TreeSet<Integer> tset3 = new TreeSet<>(tset2);
		System.out.println(tset3);
		
		int treesize=tset2.size();		
		for(int i =0; i<treesize;i++) {
			System.out.print(tset2.pollFirst()+" ");
		}
		System.out.println();
		System.out.println(tset2.isEmpty());
		
		treesize=tset3.size();	
		for(int i =0; i<treesize;i++) {
			System.out.print(tset3.pollLast()+" ");
		}
		System.out.println();
		System.out.println(tset3.isEmpty());
		
		
		String[] str = tset1.toArray(new String[0]);
		System.out.println(Arrays.toString(str));
		
		for(String s : tset1) {
			System.out.print(s+" ");
		}


		
		
		

	}
}
