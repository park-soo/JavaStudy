package study15_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;

public class ThinkPrac {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(List.of(3,6,2,2,2,7));
		HashSet<Integer> set = new HashSet<>(list);						// 리스트에서 set으로 갔을때 중복을 없애고  3,6,2,7
		TreeSet<Integer> tset = new TreeSet<>(set);						// treeSet에서 오름차순으로 정렬이 됐고 2,3,6,7
		Stack<Integer> stack = new Stack<>();
		stack.addAll(tset);												// stack에 추가를 했고 2,3,6,7
		while(!stack.empty()) {
			System.out.println(stack.pop());							// stack은 LIFO이니까 마지막에 들어온놈이 제일 먼저 나가니까 7 6 3 2 
		}
		
	}
}

