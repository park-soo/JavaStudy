package studyTest1;

import java.util.ArrayList;
import java.util.Scanner;

public class Control {

	public static void start() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요: ");
		String a = scan.next();
		
		ArrayList<String> b = new ArrayList<>();
		ArrayList<String> d = new ArrayList<>();
		
		String[] c = a.split("");
		
		for(int i=0; i<c.length;i++) {
			b.add(c[i]);
		}
		b.sort(null);
		System.out.println(b);
		
		
		
		
	}

}
