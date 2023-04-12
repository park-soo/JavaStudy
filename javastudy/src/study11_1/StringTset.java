package study11_1;

import java.util.StringTokenizer;

public class StringTset {
	public static void main(String[] args) {
		byte[] bytes = {73,32,108,111,118,101,32,121,111,117};
		
		String str = new String(bytes);
		System.out.println(str);
		
		
		str = "모든 프로그램은 자바 언어로 개발될 수 있다.";
		//"자바" 없으면 "자바 없음" 이라고 출력.
		//"자바" 있으면 "Java" 바꿔서 출력.
		
		int index = str.indexOf("자바");
		System.out.println(index);			// 인덱스 값을 통해 있으면 인덱스 번호를 반환, 아니면 -1를 반환 으로 구분하여 찾을 수 있음.
		                                                                
		if(str.contains("자바")) {
			System.out.println(str.replace("자바", "Java"));
		} else {
			System.out.println("자바 없음");
		}
		
		str = "1,2,3,4,5,6,7,8,9,10";
		// 한개의 문자열 숫자만 다 합친 결과 값 55
		// 1. split() 메서드 사용
			int total = 0;
			String[] s= str.split(",");
			for(int i=0; i<s.length;i++) {
				 total += Integer.parseInt(s[i]);		// String type을 int type으로 변경 할 때 사용.
			}
			
//			for (String a : s) {						// 향상된 for 문
//				total += Integer.parseInt(a);
//			}
			
			System.out.println(total);
			
		// 2. StringTokenizer 사용
			total = 0;
			StringTokenizer stk = new StringTokenizer(str,",");
			while(stk.hasMoreTokens()) {
				total += Integer.parseInt(stk.nextToken());
			}
			System.out.println(total);
		
	}
}
