package study16;

public class ArithmeticRun {
	public static void main(String[] args) {
		
		try {
			System.out.println(5/0);
			byte[] list = {'a','b','c'};
			System.out.println(list[5]);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("예외 원인: "+e.getMessage());
			System.out.println(e.toString());
		}
		 finally {
			System.out.println("반드시 실행");
		}			
	}
}
