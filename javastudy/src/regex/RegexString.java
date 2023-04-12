package regex;

public class RegexString {
	public static void main(String[] args) {
		
		//matches()
		String txt = "12345";
		boolean result1 = txt.matches("[0-9]+");
		System.out.println(result1);
		
		//replaceAll()
		String txt2 = "study2023*-;";
		String res2 = txt2.replaceAll("\\W", "!");
		System.out.println(res2);
		
		//split()
		String[] txts = txt2.split("\\d"); 
		for(String tt: txts) {
			System.out.println(tt);
		}
		
	}
}
