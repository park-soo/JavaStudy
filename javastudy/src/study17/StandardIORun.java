package study17;

public class StandardIORun {
	public static void main(String[] args) {
		try {
			
			System.out.println("영문자 하나만 누르고 엔터");
			
			int i = 0;
			while((i=System.in.read())!='\n') {
				System.out.println(i);
				System.err.println(i);
			}
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
