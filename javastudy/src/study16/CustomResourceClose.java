package study16;


class CustomResouces implements AutoCloseable{
	public CustomResouces() {
		System.out.println("CustomResouces 생성자");
	}
	public void printMessage() {
		System.out.println("CustomResouces 메소드 실행");
	}
	@Override
	public void close() throws Exception {
		System.out.println("CustomResouces 요소 반환");
	}
}

class CustomResouces2 implements AutoCloseable{
	public CustomResouces2() {
		System.out.println("CustomResouces2 생성자");
	}
	public void printMessage() {
		System.out.println("CustomResouces2 메소드 실행");
	}
	@Override
	public void close() throws Exception {
		System.out.println("CustomResouces2 요소 반환");
	}
}

public class CustomResourceClose {
	public static void main(String[] args) {
		
		try(
				CustomResouces cus  = new CustomResouces();
				CustomResouces2 cus2  = new CustomResouces2();
		){
			cus.printMessage();
			cus2.printMessage();
		}
		catch (Exception e ) {
			e.printStackTrace();
		}
		
		
	}
}
