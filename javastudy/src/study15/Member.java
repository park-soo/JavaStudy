package study15;

public class Member implements Comparable<Member> {
	private Integer memberId;
	private String memberName;
	private Integer memberAge;

	public Member(Integer memberId, String memberName, Integer memberAge) {
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberAge = memberAge;
	}

	public Integer getMemberId() {
		return memberId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public Integer getMemberAge() {
		return memberAge;
	}
	public void setMemberAge(Integer memberAge) {
		this.memberAge = memberAge;
	}
	
	
	@Override
	public int hashCode() {
		return memberId.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			return ((Member)obj).getMemberId() == this.memberId;
		} else {
			return false;
		}
	}
	@Override
	public int compareTo(Member mem) {
		return memberId.compareTo(mem.memberId);
	}
	@Override
	public String toString() {
		return String.format("||ID: %s||이름: %s||나이: %s||", memberId,memberName,memberAge);			//format은 다 String으로 받아드려서 %s로 다함.
	}
}

class Point{
	private int point;
	public Point(int point) {
		this.point = point;
	}
	
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	@Override
	public String toString() {
		
		return "포인트: "+ point;
	}
	
	
}





