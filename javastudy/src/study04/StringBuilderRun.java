package study04;

public class StringBuilderRun {

	public static void main(String[] args) {
		//StringBuilder 멀티스레드 환경에서 더 안전
		//StringBuilder 버퍼보다 성능 더 우수
		StringBuilder sb1 = new StringBuilder("가나다");
		StringBuilder sb2 = new StringBuilder("가나다");
		StringBuilder sb3 = new StringBuilder("abc");
		//append 
		sb1.append(false);
		sb2.append(12.3);
		sb3.append("def");
		System.out.println(sb1);
		System.out.println(sb1.toString());
		System.out.println(sb2);
		System.out.println(sb3);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.equals(sb3));
		String str1 = sb1.toString();
		String str2 = sb2.toString();
		System.out.println(str1.equals(str2));
		
		//insert
		sb1.insert(3, "라마바사");
		System.out.println(sb1.toString());
		//delete
		sb1.delete(7,12);
		System.out.println(sb1.toString());
		System.out.println(sb1.indexOf("라"));
		//substring()
		System.out.println(sb1.substring(1,4));
		System.out.println(sb1);
		//replace()
		System.out.println(sb1.replace(1, 4, "지마"));
		System.out.println(sb1);
		//reverse()
		System.out.println(sb1.reverse());
		System.out.println(sb1);

	}

}
