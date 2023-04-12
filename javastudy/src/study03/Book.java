package study03;

public class Book {
	
	//정보은닉한 필드의 멤버변수
	private String bookName;
	private String author;
	
	//생성자 2개 기본생성자, 멤버변수2개를 매개변수로 받아서 생성자
	
	public Book() {
		
	}
	public Book(String bookName, String author) {
		this();
		this.bookName = bookName;
		this.author = author;
	}
	// getter setter
	public String getBookName() {
		return bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void printBookInfo() {
		System.out.println("book "+bookName+" by "+author);
	}
	
	public Book clone() {
		Book res = new Book();
		res.bookName = this.bookName;
		res.author = this.author;
		return res;
	}
	
}
