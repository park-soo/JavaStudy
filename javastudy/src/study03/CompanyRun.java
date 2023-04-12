package study03;

public class CompanyRun {
	public static void main(String[] args) {
		//Company com = new Company();
		System.out.println(Company.getInstance()); // 반환자료형 Company. // 함수명 getInstance // ( ) 매개변수
		System.out.println(Company.getInstance());
		System.out.println(Company.getInstance());
		System.out.println(Company.getInstance());
	}
	
}


