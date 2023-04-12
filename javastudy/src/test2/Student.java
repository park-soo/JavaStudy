package test2;

public class Student {
	private final String name;		//이름
	private final boolean isMale;	//성별
	private final int grade;		//학년
	private final int ban;			//반
	private final int scroe;		//점수

	//멤버변수를 매개변수로 사용하는 생성자

	public Student(String name, boolean isMale, int grade, int ban, int score) {
		this.name = name;
		this.isMale = isMale;
		this.grade = grade;
		this.ban = ban;
		this.scroe = score;
	}
	
	//toString
	@Override
	public String toString() {
		return String.format("[%s,%s,%d학년 %d반 %3d점]", name,isMale?"남":"여",grade,ban,scroe);
	}

	
	//getter //setter는 final 이기때문세 생성 안됌.
	public String getName() {
		return name;
	}

	public boolean getIsMale() {
		return isMale;
	}

	public int getGrade() {
		return grade;
	}

	public int getBan() {
		return ban;
	}

	public int getScroe() {
		return scroe;
	}
	







}
