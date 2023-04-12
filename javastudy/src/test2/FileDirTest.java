package test2;

import java.io.File;

public class FileDirTest {
	public static void main(String[] args) {
		String path="D:\\workspace\\javastudy\\src";
		
		showHierarchy(path);
		
		
		
	}
	
	static void showHierarchy(String path) {
		File target = new File(path);
		File[] files = target.listFiles();		//가지고 있는 파일 리스트들을 하나씩 확인.
		for(File file1:files) {
			if(file1.isFile()) {
				System.out.println("파일: "+file1.getName()+"     "+file1.getPath());
			} else {
				System.out.println("폴더: "+file1.getName()+"     "+file1.getPath());
				showHierarchy(file1.getPath());
				
			}
			
		}
	}
	
	
	
}
