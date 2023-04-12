package study14;

public class Member implements Comparable<Member>{
	Integer memberId;
	String name;
	Integer age;
	
	Member(Integer id, String name, Integer age){
		this.memberId = id;
		this.name = name;
		this.age = age;
	}
	
	public Integer getMemberId( ) {
		return memberId;
	}
	public void setMemberId(Integer id) {
		this.memberId = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public int hashCode() {							// 들어오는 대상에 대해서 중복 체크
		
		return memberId.hashCode();
	}
	@Override
	public boolean equals(Object obj) {				// 들어오는 대상에 대해서 중복 체크
		if(obj instanceof Member) {
			Member mem = (Member)obj;
			return this.memberId == mem.memberId;
		} else {
			return false;
		}
		
	}
	@Override
	public int compareTo(Member mem) {								// 대소비교를 통해 저장을 할떄 사용 해야 함.
		
		//return this.name.compareTo(mem.getName());				//이름 순
		//return this.age.compareTo(mem.getAge());					//나이 순
		//return this.memberId.compareTo(mem.getMemberId());		//멤버 아이디 순
		return (this.memberId.compareTo(mem.getMemberId()))*(-1);	//역순으로 할 때, 전체 값에 -1를 곱해준다. Why!? compareTo는 크면 1이고, 작으면 -1 값이 나오기 때문에..
	}
	
	
	
	
	
}
