package study16;

public class ThrowsRun {
//	static void handleException() {
//		
//		try {
//			System.out.println("호출된 메서드");
//			Exception e = new Exception();
//			throw e;			
//		}
//		catch(Exception e) {
//			System.out.println("호출된 메서드에서 예외처리");
//		}
//		
//	}
	static void handleException() throws Exception {				//throws Exception 예외 회피...!!
		
			System.out.println("호출된 메서드");
			Exception e = new Exception();
			throw e;			
		
	}

	public static void main(String[] args) {
		try {
			
			handleException();										// 호출한 사람이 예외처리를 해야 함.
		}
		catch(Exception e ) {
			e.printStackTrace();
			System.out.print("method 발생한 예외회피를 main에서 예외처리함");
		}
	}
}
