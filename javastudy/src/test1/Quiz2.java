package test1;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz2 {
	public static void main(String[] args) {
		
		// 퀴즈 주석만 보고 코드 작성해보기.
		
		
		// 1.변수
		int korean = 80; // 각 과목 변수 설정
		String english = "75"; // 각 과목 변수 설정
		double math = 53; // 각 과목 변수 설정

		// 평균값을 구하는 것으로
		System.out.println((korean+Integer.parseInt(english)+math)/3);// 국어는 int그대로 + 영어는 String 임으로 int값으로 변경하여 + 수학은 double로 int와 사용이 가능 / 과목수

		// 2.짝수 홀수 구분
		int[] source = { 9, 12, 14, 21, 16, 13 }; // 배열 생성
		ArrayList<Integer> even = new ArrayList<>();// 짝수 담을 배열 생성
		ArrayList<Integer> odd = new ArrayList<>();// 홀수 담을 배열 생성
		for(int s : source) { //향상된 for문을 이용하여, source 배열에 있는 값을 하나씩 출력
			if(s%2==0) {
				even.add(s);
			} else {
				odd.add(s);
			}
			 
		}

		System.out.println(even);// 짝수 배열 출력
		System.out.println(odd);// 홀수 배열 출력

		// 5.역순정렬(선택정렬) -> Arrays.sort() // 큰 값에서 작은 값으로 정렬하는 것.
		int[] source1 = { 9, 12, 14, 21, 16, 13 }; // 배열 생성
		
		for(int i=0; i<source1.length;i++){ // for문을 이용하여 배열에 있는 값(i)을 하나씩 출력
			for(int j=i+1; j<source1.length; j++) {	// 이중 for문을 이용하여 값(i)+1 한 배열을 출력
				if(source1[i]<source1[j]) {		// i가 j보다 작으면
					int temp = source1[i];		// 임시 저장소 temp에 i값을 넣고
					source1[i]=source1[j];// j값을 i에 저장
					source1[j] = temp;// temp에 있는 값을 j로 저장하여 값을 스왑한다.
					
				}
				
			}

		}
		System.out.println(Arrays.toString(source1));
		
		// 3.주민번호 - > 생년월일 성별
		String socialNumber = "871130-1463217";	// String 배열의 주민번호
		String[] sNums = socialNumber.split("-");// "-" 기준으로 배열을 자름. sNums[0], sNums[1] 이 생김.
		int code = Integer.parseInt(sNums[1].substring(0,1));// code변수를 생성하여 sNums[1]배열에서 첫번째 값을 code에 저장
		String birthDate = "";			// 년도 구분하는 변수 생성
		String gender = null;			// 남자, 여자 구분 변수 생성
		if(code==1||code==2) { // sNums[1]배열에서 첫번째 값이 1 또는 2이면
			birthDate="19"+sNums[0].substring(0,2);// "19" + sNums[0]에 0,1에 해당하는 값을 출력(87)
			gender=code==1? "남자": "여자";// 성별이 code값이 1이면 ? 남자 : 여자
		} else if(code==3||code==4) { // sNums[1]배열에서 첫번째 값이 3 또는 4이면
			birthDate="20"+sNums[0].substring(0,2);// "20" + sNums[0]에 0,1에 해당하는 값을 출력()
			gender=code==3? "남자": "여자";// 성별이 code값이 3이면 ? 남자 : 여자
				
			}
			// 19+87+"년"+sNum[0]에 2,3(1 1) +"월" + sNum[0]에 4,6(3 0)+ "일" + "| 성별:"+ gender
			System.out.println(birthDate+"년"+sNums[0].substring(2,4)+"월"+sNums[0].substring(4,6)+"일"+"| 성별:"+ gender);
			

		// 4.문자열 치환
		String a = "a:b:c:d"; // : -> # 변경
		System.out.println(a.replaceAll(":", "#"));// replaceAll 사용하여 변경.

	}
}
