package study15_1;

import java.util.Scanner;
import java.util.TreeMap;

class Dictionary {
	private TreeMap<String, String> dic;

	public Dictionary() {
		dic = new TreeMap<String, String>();

	}

	// 단어 추가
	public void addWord(String eng, String kor) {
		dic.put(eng, kor);
	}

	// delWord() //단어 삭제
	public void delWord(String eng) {
		dic.remove(eng);
	}

	public String translate(String eng) {
		return dic.get(eng);
	}

	public TreeMap<String, String> getDic() {
		return dic;
	}

	public void setDic(TreeMap<String, String> dic) {
		this.dic = dic;
	}
}

public class DictionaryPrac {
	public static void main(String[] args) {
		Dictionary dic = new Dictionary();

		Scanner scan = new Scanner(System.in);
		dic.addWord("baby", "아기");
		dic.addWord("love", "사랑");
		dic.addWord("apple", "사과");
		dic.addWord("banana", "바나나");
		dic.addWord("egg", "달걀");
		dic.addWord("Coffee", "커피");

		System.out.println("=====영한사전=====");
		while (true) {
			System.out.println(dic.getDic().keySet());
			System.out.print("찾는 영단어: ");
			String input = scan.next();
			if (input.equals("그만")) {
				System.out.println("종료");
				break;
			} else if (input.equals("삭제")) {
				System.out.println("=====등록되어있는 단어 목록=====");
				System.out.println(dic.getDic().keySet());
				System.out.print("삭제할 영단어: ");
				String delInput = scan.next();
				if (dic.getDic().containsKey(delInput) == true) {
					dic.delWord(delInput);
					System.out.println("삭제되었습니다.");
					continue;
				} else {
					System.out.println("등록되어 있지 않은 영단어 입니다.");
					continue;
				}
			}
			String output = dic.translate(input);
			if (dic.getDic().containsKey(input) == false) {
				System.out.println("사전에 없는 단어입니다.");
				System.out.println("사전에 추가하시겠습니까?(Y/N)");
				String ans = scan.next().toUpperCase();
				if (ans.equals("Y")) {
					System.out.println("단어: " + input);
					System.out.print("의미: ");
					String kor = scan.next();
					dic.addWord(input, kor);
					System.out.println("단어가 추가 되었습니다.");
				}
			} else {
				System.out.println("의미: " + output);
			}
		}

	}
}