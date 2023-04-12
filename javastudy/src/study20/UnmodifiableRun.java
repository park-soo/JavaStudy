package study20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableRun {
	public static void main(String[] args) {
		List<Character> list = new ArrayList<>();
		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');
		
		try {
			list.forEach(System.out::println);
			list = Collections.unmodifiableList(list);		//추가, 삭제 불가..			//readonly같은 놈. 읽을수만 있고, 
			list.remove(2);									// UnsupportedOperationException예외	발생.
			list.add('e');									// UnsupportedOperationException예외	발생.
			
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		}
		System.out.println(list);
		
		List<Character> newList = new ArrayList<>(list);
		newList.add('k');
		System.out.println(list);
		System.out.println(newList);
		
		
		List<Character> unmodList = Collections.unmodifiableList(newList);
		System.out.println(newList);
		System.out.println(unmodList);
		
		
		try {
			unmodList.add('e');
		} catch (Exception e) {
			e.printStackTrace();
		}
		newList.add('z');						//원본에서 추가가 되면 자동으로 추가가 된다고 함.
		System.out.println(unmodList);			//원본에서 추가가 되면 자동으로 추가가 된다고 함.
		
	}
}
