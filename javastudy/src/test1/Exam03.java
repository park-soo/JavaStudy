package test1;

public class Exam03 {
	public static void main(String[] args) {
		// A Class에 10명의 학생이 성적이 아래와 같다면 평균 값은?
		
	
		int[] scores = {70,60,55,75,95,90,79,80,85,100};
		
		
		//for
		double total = 0;
		
		for(int i=0; i<scores.length;i++) {
			total += scores[i];
			
		}
		//System.out.println(total);
		
		total = total/scores.length;			
		System.out.println(total);
		
		
		// 향상된 for
		total = 0;
		for(int i : scores) {
			total +=i;
		}
		//System.out.println(total);
		
		total=total/scores.length;
		System.out.println(total);
		
		
	}
}
