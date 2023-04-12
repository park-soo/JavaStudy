package study11_1;

class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	// object equals() 학번이 같으면 같은 학생
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {					// Student가 아닌 다른 객체가 오면 에러가 발생하기 떄문에 instanceof사용하여 인스턴스를 확인 후 진행.
			Student stu = (Student) obj;				// object타입이여서 studentNum에 접근하여 비교하기 위해서는 다운 캐스팅을 형변환을 통해 접근.
			if (studentNum.equals(stu.studentNum)) {	
				return true;
			}
		}
		return false;
	}

	// hashcode() 학생의 학번의 해쉬코드 반환
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}

}

public class StudentExam {
	public static void main(String[] args) {
		Student s1 = new Student("100");
		Student s2 = new Student("200");
		Student s3 = new Student("100");
		sameStudent(s1, s2);
		sameStudent(s1, s3);

	}

	public static void sameStudent(Student a, Student b) {
		if (a.equals(b)) {
			System.out.println("같은 학생이다.");
		} else {
			System.out.println("다른 학생이다.");
		}
		System.out.println(a.hashCode() + " " + b.hashCode());
	}

}
