package study04;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringRun {
	public static void main(String[] args) {
		//String class
		
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1==str2);
		String str3 = "bcd";
		String str4 = "bcd";
		System.out.println(str3==str4);
		System.out.println(str1.toString());
		
		
		
		//equals()
		
		String a = "hello";
		String b = "world";
		String c = "hello";
		String d = new String("hello");
		
		System.out.println(a==c);
		System.out.println(a==d);
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		
		
		//indexOf() 해당 문자열의 시작 인덱스
		String e = "Hello Java!!";
		System.out.println(e.indexOf("jav"));
		
		//hello java!!
		//0123456789
		
		// 인덱스 오브 사용시 내용이 없을 경우 -1 
		
		//contains() 해당 문자열의 포함여부
		System.out.println(e.contains("va"));
		// boolean 값으로 출력됨.
		
		//charAt() 특정 위치의 문자 반환
		System.out.println(e.charAt(4));
		
		//replaceAll() 특정 문자열의 교체한 문자열 반환
		System.out.println(e.replaceAll("java", "html"));
		System.out.println(e);
		String f =e.replaceAll("java", "html");
		System.out.println(f);
		
		//substring() 문자열의 특정 부분 추출
		System.out.println(e.substring(1,8));
		//toUpperCase(), toLowCase() 대소문자 변경
		System.out.println(e.toUpperCase());
		System.out.println(e.toLowerCase());
		System.out.println(e.toString());
		
		//compareTo(), compareToIgnoreCase()
		// 문자열을 비교하여 같다면 0, 작으면 음수, 크면 양수 반환

		String str = new String("abcd");
		System.out.println(str.compareTo("bcde"));
		System.out.println(str.compareTo("abcd"));
		

		System.out.println(str.compareTo("AbCd"));
		System.out.println(str.compareToIgnoreCase("AbCd"));
		
		//concat() 문자열을 추가하여 새로운 문자열 반환
		System.out.println(e.concat(str));
		
		//+
		System.out.println(e+str);
		int num = 3, num2 = 4;
		String str5="5", str6="6";
		char ch = '4', ch2='5';
		System.out.println(num+num2);
		System.out.println(str5+str6);
		System.out.println(str5+num);
		System.out.println(num+str5);
		System.out.println(ch+ch2);
		System.out.println(ch+num2);
		System.out.println(num2+ch);
		System.out.println(3+""+6);
		//trim()문자열의 맨 앞 맨 뒤의 공백 제거
		String g = "  Java    Java     ";
		System.out.println(g);
		System.out.print("|||");
		System.out.print(g.trim());
		System.out.println("|||");
		
		//length() isEmpty()
		System.out.println(g.length());
		System.out.println(g.isEmpty());
		
		String test = "이 문장은 문자열-입니다. /This is the String.";
		String[] token = test.split(" ");
		System.out.println(Arrays.toString(token));
		token = test.split("");
		System.out.println(Arrays.toString(token));
		token = test.split("/");
		System.out.println(Arrays.toString(token));
		token = test.split("-");
		System.out.println(Arrays.toString(token));
		
		//StringTokenizer class
		//기본
		// StringTokenizer stk = new StringTokenizer(test);
		// 구분자를 포함하거나 제외할 수 있다.
		//StringTokenizer stk = new StringTokenizer(test,"-");
		StringTokenizer stk = new StringTokenizer(test,"-",true);
		while(stk.hasMoreTokens()) {
			
			System.out.println(stk.nextToken());
		}
		
		
		
		
		
		
		
		
	}
}
