package study02;

public class StudentPrac {

	public static void main(String[] args) {
		
		Student stuA = new Student();
		stuA.korea.setSubjectName("한국");
		System.out.println(stuA.korea.getSubjectName());
		
		Student stuB = new Student(100, "홍길동", "남성");
		System.out.println(stuB.english.getSubjectName());
		
		stuA.studentId=200;
		stuA.studentName="홍길동";
		stuA.address="서울어딘가";
		stuA.gender="남성";
		
		stuA.showStudentInfo();
	}

}
