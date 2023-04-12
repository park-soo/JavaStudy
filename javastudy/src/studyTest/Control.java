package studyTest;

import java.util.Scanner;


public class Control {
	
	public static void star(OutMethod outMethod ) {
		outMethod.output();
	}
	
	public static void start() {
		

		Scanner scan = new Scanner(System.in);
	    System.out.print("숫자를 입력하세요: ");

	    if(scan.hasNextInt()) {
	      int num = scan.nextInt();
	      for(int i=0; i<num;i++) {
	    	  star(new Integer());
	      }
	    } else if(scan.hasNextDouble()) {
	      double num = scan.nextDouble();
	      double floorNum = Math.floor(num);
	      for(double i=0; i<floorNum;i++) {
	    	  star(new Double());
	      }
	      
	    } else {
	      System.out.println("입력한 값은 숫자가 아닙니다.");
	    }

	    scan.close();
		
	}
	
}
