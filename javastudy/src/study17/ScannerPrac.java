package study17;

import java.io.*;
import java.util.Scanner;

public class ScannerPrac {
	public static void main(String[] args) {
		
		File file = new File("src/study17/files/input.txt");
		
		int result=0;
		try(Scanner sc = new Scanner(file)) {
			while(sc.hasNextInt()) {
				result += sc.nextInt();
			}
			System.out.println(result);				
		}
		catch(IOException e ) {
			e.printStackTrace();
			System.out.println("파일이 없어용");
		}
		
		
		
	}
}
