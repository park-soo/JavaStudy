package study20;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.*;

public class StreamMakeRun {
	public static void main(String[] args) throws IOException {
		//Collection
		ArrayList<Integer> alist = new ArrayList<>(Arrays.asList(6,5,4,3,2,1));
		
		Stream<Integer> collectionStream = alist.stream();
		
		collectionStream.forEach(System.out::print);
		System.out.println();
		
		//Arrays
		String[] sarr = new String[] {"넷","셋","둘","하나"};
		Stream<String> arrayStream = Arrays.stream(sarr);		
		arrayStream.forEach(str->System.out.print(str+" "));
		System.out.println();
		
		arrayStream = Arrays.stream(sarr,1,3);
		arrayStream.forEach(str->System.out.print(str+" "));
		System.out.println();
		
		
		//기본형
		Stream<Double> doubleStream = Stream.of(4.3,3.7,1.4,2.7);
		doubleStream.forEach(num->System.out.print(num+" "));
		System.out.println();
		
		IntStream intStream = IntStream.range(1, 5);
		intStream.forEach(num->System.out.print(num+" "));
		System.out.println();
		
		LongStream longStream = LongStream.rangeClosed(1, 5);
		longStream.forEach(num->System.out.print(num+" "));
		System.out.println();
		
		DoubleStream ds = new Random().doubles(2);
		ds.forEach(num->System.out.print(num+" "));
		System.out.println("");
		
		DoubleStream ds1 = new Random().doubles(2,1,6);
		ds1.forEach(num->System.out.print((int)num+" "));
		System.out.println("==========================");
		
		IntStream is = "I lovu you".chars();
		is.forEach(num->System.out.print((int)num+" "));
		System.out.println();
		
		
		//정규식, 정규표현식, Regular Expression, RegEx
		Stream<String> streamReg = Pattern.compile(", ").splitAsStream("서울, 대전, 대구, 부산, 찍고");
		streamReg.forEach(str->System.out.print(str+" "));
		System.out.println();
		
		System.out.println(System.getProperty("user.dir"));
		Stream<String> streamFile = Files.lines(Paths.get("src/study20/testfile.txt"),Charset.forName("UTF-8"));
		
		streamFile.forEach(str->System.out.println(str));
		System.out.println();
		
		
		//null -> 빈 스트림
		ArrayList<String> alist2 = new ArrayList<>();
		Stream<String> streamNull = (alist2==null||alist2.isEmpty())?Stream.empty():alist2.stream();
		
		streamNull.forEach(str->System.out.print(str+" "));
		System.out.println();
		
		
		// Stream.builer()
//		Stream.Builder<String> builder = Stream.builder();
//		Stream<String> bstream = builder.add("수학").add("물리").add("영어").build();
		
		Stream<String> bstream = Stream.<String>builder().add("수학").add("물리").add("영어").build();
		
		
		bstream.forEach(str->System.out.print(str+" "));
		System.out.println();
		
		
		//generate()
		Stream<String> gstream =  Stream.generate(()->"WoW").limit(4);
		gstream.forEach(str->System.out.print(str+" "));
		System.out.println();
		
		//iterate()
		Stream<Integer> istream = Stream.iterate(100, num->num+2).limit(5);
		istream.forEach(num->System.out.print(num+" "));
		System.out.println();
		
		
		
		
	}
}
