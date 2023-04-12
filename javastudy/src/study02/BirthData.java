package study02;


class Birthday {
	// 필드 멤버변수
	private int year;
	private int month;
	private int date;
	
	// 생성자 (클래스명과 동일하게 작성 해야 함.)(반환자료형이 존재하지 않음.)
	public Birthday() {
		this.year=1980;
		this.month=3;
		this.date=8;
		
		// this(1980,3,8);
		
	}
	// 동일한 이름의 생성자를 생성(매개변수를 다르게 하여)(메소드 오버로딩)
	public Birthday(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
		
	}
	
	// 변수 관련 메소드 getter, setter (private를 사용해서 접근을 불가능 할 때)
	public int getyear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}
	
	// 값을 한꺼번에 다 보기 위해 전용 메소드를 작성해봄.
	public String showBirthday() {
		return year+"년"+month+"월"+date+"일";
	}

}

public class BirthData {
	public static void main(String[] args) { 
		
		Birthday birthday = new Birthday();
		System.out.println(birthday.getyear()); //getter를 사용해서 접근 가능
		birthday.setYear(2000); // setter를 사용해서 접근 가능
		System.out.println(birthday.getyear());
		
		System.out.println(birthday.showBirthday());
		
		Birthday birthday2 = new Birthday(2001,10,7); // 08, 09는 숫자가 아니라 String 인식 8진수, 16진수 ? 그런 이유
		System.out.println(birthday2.showBirthday());
	
		
		
	}
}
