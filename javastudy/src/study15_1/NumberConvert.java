package study15_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;

public class NumberConvert {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(7, 5, 3, 2, 1, 3, 6, 8, 3, 4, 5, 3, 2, 10, 2, 9));

		//중복제거, 오름차순 정렬			// TreeSet은 오름차순으로 정렬이 되기때문에 ..
		TreeSet<Integer> tset = new TreeSet<>(numbers);
		System.out.println(tset);
		
		//역순
		System.out.println(tset.descendingSet());
		
		NavigableSet<Integer> nset = new TreeSet<>(tset).descendingSet();
		System.out.println(nset);
		
		//랜덤으로 1-10사이 20개의 숫자를 배열에 저장하고 
		//중복제거 오름차순 내림차순으로 출력
		
		
		List<Integer> alist = new ArrayList<>();
		
		Random number = new Random();
		

		for(int i = 0; i < 20; i++) {

			int a= number.nextInt(20)+1;  
			System.out.print(a+" ");
			
		    alist.add(a);
		    
		} System.out.println();
		System.out.println(alist);
		
		TreeSet<Integer> tset2 = new TreeSet<>(alist);
		
		System.out.println(tset2);
		System.out.println(tset2.descendingSet());
		
		
		
		
		

		

		
		

		
	}
}
