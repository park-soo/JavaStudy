package study14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterfaceClass {
	public static void main(String[] args) {
		//객체 생성
		//ArrayList<Integer> alist = new ArrayList<>();
		//LinkedList<Integer> llist = new LinkedList<>();
		//Vector<Integer> vec = new Vector<>();
		
		//List로 만들어도 가능함 		//ArrayList, LinkedList, Vector 다 List를 상속 받고 있기 때문에...
		List<Integer> alist = new ArrayList<>();
		List<Integer> llist = new LinkedList<>();
		List<Integer> vec = new Vector<>();				//호환 동기화가 필요할 때.... 
		
		long start= 0;
		long end = 0;
		
		//추가
		start = System.nanoTime();
		for(int i=0; i<99999;i++) {
			alist.add(0,i);
		}
		end = System.nanoTime();
		System.out.printf("ArrayList : %11d\n",(end-start));
	
		start = System.nanoTime();
		for(int i=0; i<99999;i++) {
			llist.add(0,i);
		}
		end = System.nanoTime();
		System.out.printf("LinkedList : %11d\n",(end-start));
		
		//읽기
		start = System.nanoTime();
		for(int i=0; i<99999;i++) {
			alist.get(i);
		}
		end = System.nanoTime();
		System.out.printf("ArrayList : %11d\n",(end-start));
	
		start = System.nanoTime();
		for(int i=0; i<99999;i++) {
			llist.get(i);
		}
		end = System.nanoTime();
		System.out.printf("LinkedList : %11d\n",(end-start));
		
		//삭제
		start = System.nanoTime();
		for(int i=0; i<99999;i++) {
			alist.remove(0);
		}
		end = System.nanoTime();
		System.out.printf("ArrayList : %11d\n",(end-start));
	
		start = System.nanoTime();
		for(int i=0; i<99999;i++) {
			llist.remove(0);
		}
		end = System.nanoTime();
		System.out.printf("LinkedList : %11d\n",(end-start));
		
		
		
	}
}
