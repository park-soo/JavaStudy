package study14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListToArray {
	public static void main(String[] args) {
		ArrayList<Integer> alist1 = new ArrayList<>(Arrays.asList(1,2,3,4));
		ArrayList<Integer> alist2 = new ArrayList<>(List.of(1,2,3,4));
		
		LinkedList<Integer> llist1 = new LinkedList<>(Arrays.asList(5,6,7,8));
		LinkedList<Integer> llist2 = new LinkedList<>(List.of(5,6,7,8));
		
		Vector<Integer> vec1 = new Vector<>(Arrays.asList(9,10,11,12));
		Vector<Integer> vec2 = new Vector<>(List.of(9,10,11,12));
		
		// List로 다 바꿔도 사용 가능함		// 공통의 interface
		
//		List<Integer> alist1 = new ArrayList<>(Arrays.asList(1,2,3,4));
//		List<Integer> alist2 = new ArrayList<>(List.of(1,2,3,4));
//		
//		List<Integer> llist1 = new LinkedList<>(Arrays.asList(5,6,7,8));
//		List<Integer> llist2 = new LinkedList<>(List.of(5,6,7,8));
//		
//		List<Integer> vec1 = new Vector<>(Arrays.asList(9,10,11,12));
//		List<Integer> vec2 = new Vector<>(List.of(9,10,11,12));
		
		Object[] obj = alist1.toArray();
		System.out.println(Arrays.toString(obj));
		
		Integer[] int1 = alist1.toArray(new Integer[0]);
		System.out.println(Arrays.toString(int1));

		Integer[] int2 = llist1.toArray(new Integer[0]);
		System.out.println(Arrays.toString(int2));

		Integer[] int3 = vec1.toArray(new Integer[0]);
		System.out.println(Arrays.toString(int3));
		
		alist1.addAll(alist2);			// 배열 추가		//List에 관련된 애들은 다 추가 가능함.(LinkedList, Vector)
		System.out.println(alist1);
		
		alist1.addAll(llist1);
		System.out.println(alist1);

		alist1.addAll(3,vec1);			//	3번 인덱스 부터 배열이 추가 됌.
		System.out.println(alist1);
		
		
		
	}
}
