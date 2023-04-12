package test2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import study14.SashSetRun;

public class StreamTest2 {
	public static void main(String[] args) {
		
		System.out.println(question1());
		System.out.println(question2());
		
	}
	
	
	private final static List<String> SPELLS = Arrays.asList("TOMAS","a","hELLO","B","korea","X","nutella","apple","banana");
	
	
	
	//list에 저장된 단어에 첫번쨰 문자가 각각 몇 개 있는지
	//Map<String, Integer>로 반환 
	// 예) ("X", 1), ("a",2).....		//대소문자 구분해서...
	static Map<String, Integer> question1() {
		

		return SPELLS.stream().map(spell->spell.substring(0,1)).collect(Collectors.toMap(head->head, head->1, (oldVal,newVal)->newVal+=oldVal));
		
	}
	
	
	
	//list에 저장된 단어들 중에서 단어의 길이가 2이상인 경우에
	// 모든 단어를 대문자로 변환하여 구분자를 스페이스로 하는 문자열로 반환
	static String question2() {
	
		return SPELLS.stream().filter(str->str.length()>=2).collect(Collectors.joining(" ")).toUpperCase();
				
				

		
	}
	
	
	
}
