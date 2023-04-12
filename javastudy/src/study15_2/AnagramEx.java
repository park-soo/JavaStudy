package study15_2;

import java.util.*;

public class AnagramEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("단어를 입력해주세용: ");
		String a = scan.next();
		System.out.print("비교단어를 입력해주세용: ");
		String b = scan.next();
		boolean result = isAnagram(a,b);
		System.out.print("두 단어는 ");
		System.out.println(result?"Anagram이다.":"Anagram이 아니다.");
	}

	private static boolean isAnagram(String a, String b) {
		
		ArrayList<String> arr1 = new ArrayList<>(Arrays.asList(a.split("")));
		ArrayList<String> arr2 = new ArrayList<>(Arrays.asList(b.split("")));
		
		arr1.sort(null);
		arr2.sort(null);
		
		System.out.println(arr1);
		System.out.println(arr2);
		
		return arr1.equals(arr2)?true:false;
		
		
	}
	
	
	
	
}
