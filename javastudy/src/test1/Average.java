package test1;

import study03.Book;

class Subject{
	
	String name;
	int score;
	
	
	Subject(String name, int score) {
		this.name = name;
		this.score = score;
	}
	

}

public class Average {

	public static void main(String[] args) {
		
		Subject s1 = new Subject("국어", 80);
		Subject s2 = new Subject("영어", 75);
		Subject s3 = new Subject("수학", 55);
		
		
		System.out.println(s1.name+" "+s2.name+" "+s3.name);
		System.out.println(s1.score+"  "+s2.score+"  "+s3.score);
		System.out.println("평균: "+(s1.score+s2.score+s3.score)/3);

	}
}
