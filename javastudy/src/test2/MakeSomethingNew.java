package test2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MakeSomethingNew {
	public static void main(String[] args) throws IOException {
		//tst2.files 아래로 폴더명과 파일명을 입력받아서 새로 생성
		
		String path="src/test2/";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("폴더명 입력: ");
		String a = scan.next();
		
		System.out.print("파일명 입력: ");
		String b = scan.next();

		
		
		//폴더 생성
		File dir = new File(path+a);
		if(!dir.exists()) {
			dir.mkdir();
		} else {
			System.out.println("동일한 폴더명을 가진 폴더가 존재 합니다.");
			return;
		}
		System.out.println(dir.exists());
		
		//파일 생성
		File file = new File(dir+"/"+b);
		if(!file.exists()) {
			file.createNewFile();
		} 
		System.out.println(file.exists());
		
		
		
		
	}
}
