package test1;

import java.util.ArrayList;

public class OddEven {
	public static void main(String[] args) {
			
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();
		
		arr.add(9);
		arr.add(12);
		arr.add(14);
		arr.add(21);
		arr.add(16);
		arr.add(13);
		
		System.out.println("배열"+arr);
		
	
		for(int i =0; i<arr.size(); i++) {
				if(arr.get(i)%2==0) {
					even.add(arr.get(i));
				} else {
					odd.add(arr.get(i));
				}
				
				
			}
		
		System.out.println("짝수"+even);
		System.out.println("홀수"+odd);
		

		}
		
}
