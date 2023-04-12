package study15_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

class PersonInfo {
	private String name;
	private String address;

	PersonInfo(String name, String address) {
		this.address = address;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

class PersonInfoList {
	private HashMap<String, PersonInfo> pList;

	PersonInfoList() {
		pList = new HashMap<String, PersonInfo>();
	}

	void addInfo(String name, String telNum, String address) {
		PersonInfo pInfo = new PersonInfo(name, address);
		pList.put(telNum, pInfo);
	}

	ArrayList<String> getPersonInfoWithName(String name) {
		
		ArrayList<String> result = new ArrayList<>();
			
		for (Entry<String, PersonInfo> s : pList.entrySet()) {
			if (s.getValue().getName().contains(name)) {
				String num = s.getKey();
				String ad = s.getValue().getAddress();
				String nm = s.getValue().getName();

				result.add( "||이름: " + nm + "||전화번호: "  + num+ "||주소: " + ad);
			}
		}
		if(result.size()==0) {
			result.add("해당 검색 대상이 없습니다.");
		}
		return result;

	}

	ArrayList<String> getPersonInfoWithTel(String telNum) {
		//정확히 다 전화번호를 입력 했을 때만 가능함.
//		if (pList.containsKey(telNum)) {
//			PersonInfo pInfo = pList.get(telNum);
//			return "||이름: " + pInfo.getName() + "||전화번호: " + telNum + "||주소: " + pInfo.getAddress();
//		} else {
//			return "해당 검색 대상이 없습니다.";
//		}
		//동일한 숫자만 들어가도 다 출력하게 작성
		
		ArrayList<String> result = new ArrayList<>();
		
		for (Entry<String, PersonInfo> s : pList.entrySet()) {
			if (s.getKey().contains(telNum)) {
				String num = s.getKey();
				String ad = s.getValue().getAddress();
				String nm = s.getValue().getName();

				result.add( "||이름: " + nm + "||전화번호: "  + num+ "||주소: " + ad);
			}
		}
		if(result.size()==0) {
			result.add("해당 검색 대상이 없습니다.");
		}
		return result;

	}

	public HashMap<String, PersonInfo> getpList() {

		return pList;
	}

	public void setpList(HashMap<String, PersonInfo> pList) {
		this.pList = pList;
	}

}

public class HashMapPrac {
	public static void main(String[] args) {
		PersonInfoList pList = new PersonInfoList();

		pList.addInfo("인순이", "011-1111-1111", "서울특별시");
		pList.addInfo("권보아", "018-2222-2222", "대구광역시");
		pList.addInfo("이보람", "010-3333-3333", "대전");
		pList.addInfo("이지스", "010-1234-4444", "경기도");
		pList.addInfo("이미라", "010-1203-5555", "부산");

		Scanner scan = new Scanner(System.in);

		System.out.println("<<전화번호 목록>>");
		while (true) {
			List<String> result = new ArrayList<>();
			System.out.println("조회대상 선택\n1.이름\n2.전화번호\n3.종료");
			System.out.println("선택: ");
			int menu = scan.nextInt();
			if (menu == 1) {
				System.out.println("<검색>\n이름: ");
				String search = scan.next();
				result = pList.getPersonInfoWithName(search);
				//System.out.println(result);
			} else if (menu == 2) {
				System.out.println("<검색>\n전화번호: ");
				String search = scan.next();
				result = pList.getPersonInfoWithTel(search);
				//System.out.println(result);
			} else {
				System.out.println("검색종료.");
				break;
			}
			for(String res:result) {
				System.out.println(res);
			}
		}

	}
}
