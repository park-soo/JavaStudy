package test2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;

public class IOTest {
	public static void main(String[] args) throws IOException {
		//FileOutputStream OutputStreamWriter를 활용 a.txt 파일 출력
		//자바공부 열심히.
		
		
		File file = new File("src/test2/a.txt");					// 파일 경로 지정
		if(!file.exists()) {										// 지정된 파일경로에 파일이 없으면
			file.createNewFile();									// 파일 생성해줌.
		}
		System.out.println(file.exists());
		
		
		OutputStream os = new FileOutputStream(file);				//출력 객체 생성
		OutputStreamWriter osw = new OutputStreamWriter(os);		//write출력 객체 생성
		osw.write("자바공부 열심히.");									//txt파일에 작성할 내용 작성
		osw.flush();												//객체 초기화.	(비워준다?)									
		osw.close();												//닫아주고 이거 안할라면 try with resources 쓰면됨.
		os.close();													//닫아주고 이거 안할라면 try with resources 쓰면됨.

		Reader reader = new FileReader(file);						//읽는 객채 생성		
		BufferedReader br = new BufferedReader(reader);
		
		
		int data;
		while((data=reader.read())!=-1) {
			
			System.out.print((char)data);
		}
		
		
		String data1;
		while((data1=br.readLine())!=null) {
			System.out.println(data1);	
		}
		
		
		
		
		
		
		
	}
}
