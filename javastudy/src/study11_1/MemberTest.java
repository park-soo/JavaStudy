package study11_1;

class Member{
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	//Object toString() 재 정의
	@Override
	public String toString() {
		
		return id+" : "+name;
	}

	
}

public class MemberTest {
	public static void main(String[] args) {
		Member mem = new Member("sulsul", "이기광");
		System.out.println(mem);
		//sulsul : 이기광
	}
}
