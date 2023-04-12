//1 package study17;
//2 
//3 import java.io.File;
//4 import java.io.IOException;
//5 import java.nio.charset.Charset;
//6 
//7 public class FileClassRun {
//8 	public static void main(String[] args) throws IOException {
//9 		String path = "D:\\workspace\\javastudy\\src\\study17\\files";
//10 		
//11 		File dir = new File(path);
//12 		if(!dir.exists()) {
//13 			dir.mkdir();
//14 		}
//15 		System.out.println(dir.exists());
//16 		
//17 		File file = new File(path+"\\TestFile.txt");
//18 		if(!file.exists()) {
//19 			file.createNewFile();
//20 		}
//21 		System.out.println(file.exists());
//22 		
//23 		File file2 = new File("D:\\workspace\\javastudy\\src\\study17\\files\\TestFile.txt");
//24 		File file3 = new File("D:/workspace/javastudy/src/study17/files/TestFile.txt");
//25 		File file4 = new File("D:"	+File.separator+"workspace"
//26 									+File.separator+"javastudy"
//27 									+File.separator+"src"
//28 									+File.separator+"study17"
//29 									+File.separator+"files"
//30 									+File.separator+"TestFile.txt");
//31 		
//32 		System.out.println(file2.exists()+" "+file2.getAbsolutePath());
//33 		System.out.println(file3.exists()+" "+file3.getAbsolutePath());
//34 		System.out.println(file4.exists()+" "+file4.getAbsolutePath());
//35 		
//36 		
//37 		System.out.println(System.getProperty("user.dir"));
//38 		File file5 = new File("src/study17/files/TestFile.txt");
//39 		File file6 = new File("src/study17/files/temp/TestFile.txt");
//40 		
//41 		System.out.println(file5.exists()+" "+file5.getAbsolutePath());
//42 		System.out.println(file6.exists()+" "+file6.getAbsolutePath());
//43 		
//44 		System.out.println(dir.getName()+" "+dir.isDirectory()+" "+dir.getParent());
//45 		System.out.println(file.getName()+" "+ file.isFile()+" "+file.getParent());
//46 		
//47 		File dir2 = new File(path+"\\temp");
//48 		System.out.println(dir2.mkdir());
//49 		
//50 		File[] files = dir.listFiles();		//가지고 있는 파일 리스트들을 하나씩 확인.
//51 		for(File file7:files) {
//52 			System.out.println(file7.getName()+" "+(file7.isFile()?"파일":"디렉토리"));
//53 		}
//54 		
//55 		
//56 		Charset cs = Charset.forName("UTF-8");
//57 		Charset cs2 = Charset.defaultCharset();
//58 		System.out.println(cs2);
//59 		System.out.println(Charset.isSupported("EUC-KR"));
//60 		
//61 		byte[] arr1 = "재승".getBytes();
//62 		byte[] arr2 = "현명".getBytes(Charset.defaultCharset());
//63 		byte[] arr3 = "종호".getBytes(Charset.forName("MS949"));
//64 		byte[] arr4 = "만수".getBytes("UTF-8");
//65 		
//66 		
//67 		System.out.println(arr1.length);
//68 		System.out.println(arr2.length);
//69 		System.out.println(arr3.length);
//70 		System.out.println(arr4.length);
//71 		
//72 		String str1 = new String(arr1);
//73 		String str2 = new String(arr2,Charset.defaultCharset());
//74 		String str3 = new String(arr3,Charset.forName("MS949"));
//75 		String str4 = new String(arr4,"UTF-8");
//76 		String str5 = new String(arr3,"UTF-8");
//77 		String str6 = new String(arr4,"MS949");
//78 	
//79 		System.out.println(str1);
//80 		System.out.println(str2);
//81 		System.out.println(str3);
//82 		System.out.println(str4);
//83 		System.out.println(str5);
//84 		System.out.println(str6);
//85 		
//86 		
//87 		
//88 		
//89 	}
//90 }
//91 
//92 