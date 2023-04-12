package study17;

import java.io.*;
import java.util.Scanner;

public class ScannerRun {
	public static void main(String[] args) {
		
		File target = new File("src/study17/files/PrintWriter.txt");
		
		try(Scanner sc = new Scanner(target)) {
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());				
			}
		}
		catch(IOException e ) {
			e.printStackTrace();
		}
		
	}
}


