package test1;

public class SecurityNumber {
	
	public static void main(String[] args) {
		String str = "871130-1463217";

		System.out.println(str);
		
		String[] s = str.split("-");
		
		System.out.println(s[0]);
		System.out.println(s[1]);
		
		String l = s[0];
		String r = s[1];
		
		System.out.println(l.charAt(0)+""+l.charAt(1));
		
		
		
		if(r.charAt(0)=='1' || r.charAt(0)=='3') {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		
		
	}
	
	
	
	
	
	
}
