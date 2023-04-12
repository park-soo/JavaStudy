package javaProject_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Control {
	
	public static int Fundm;															//복지기금 모아두는 곳.
	
	ArrayList<City> map = new ArrayList<>(); 											// city 리스트를 만든다.
	ArrayList<Player> playArr = new ArrayList<>(); 										// 플레이어 리스트를 만든다.

	public Control() {
		init();
	}

	private void init() { 																// 추가할 항목들을 추가한다. 플레이어 및 city
		playArr.clear();
		playArr.add(new Player(110, "홍길동")); 											// 플레이어 아이디, 이름.
		playArr.add(new Player(120, "홍길순"));

		map.clear();
		map.add(new City("시작점", 2));
		map.add(new City("타이페이", 50000, 50000, 250000, 250000)); 						// 이름 , 땅값 , 땅에 걸렸을때 가격, 호텔 가격, 걸렸을때 가격
		map.add(new City("베이징", 150000,280000, 750000, 1200000));
		map.add(new City("제주도", 200000, 300000, 1));
		map.add(new City("홍콩", 50000, 80000, 250000, 450000));
		map.add(new City("마닐라", 50000, 80000, 250000, 450000));
		map.add(new City("싱가폴", 50000, 100000, 250000, 550000));
		map.add(new City("아테네", 50000, 100000, 250000, 550000));
		map.add(new City("무인도", 2));
		map.add(new City("대전", 300000, 400000, 1));
		map.add(new City("코펜하겐", 100000, 140000, 500000, 750000));
		map.add(new City("스톡홀름", 100000, 160000, 500000, 900000));
		map.add(new City("베를린", 100000,160000, 500000, 900000));
		map.add(new City("시드니", 100000,180000, 500000, 950000));
		map.add(new City("하와이", 100000,180000, 500000, 950000));
		map.add(new City("리스본", 100000,200000, 500000, 1000000));
		map.add(new City("접수처", 2));
		map.add(new City("마드리드", 100000,200000, 500000, 1000000));
		map.add(new City("거창", 1000, 1000000, 1));
		map.add(new City("파리", 150000,220000, 750000, 1050000));
		map.add(new City("대구", 400000, 500000, 1));
		map.add(new City("런던", 150000,240000, 750000, 1100000));
		map.add(new City("뉴욕", 150000,260000, 750000, 1150000));
		map.add(new City("도쿄", 150000,260000, 750000, 1150000));
		map.add(new City("세계여행", 2));
		map.add(new City("로마", 150000,280000, 750000, 1200000));
		map.add(new City("부산", 500000, 600000, 1));
		map.add(new City("카이로", 200000,300000, 1000000, 1270000));
		map.add(new City("베른", 200000,320000, 1000000, 1400000));
		map.add(new City("수령", 2));
		map.add(new City("상파울로", 200000,350000, 1000000, 1500000));
		map.add(new City("서울", 1000000, 2000000, 1));
	}
	

	public void start() {
		int idx = 0; 																	// 플레이어 순서를 정하는 변수
		String input = ""; 																// 스캐너 입력시.
		Scanner scan = new Scanner(System.in); 											// 스캐너 객체 생성
		while (true) {
			if (playArr.size() == idx) { 												// 플레이어 로테이션
				idx = 0; 																// idx를 턴마다 ++ 해주면서
																						// size와 idx가 같아지면 idx를 다시 0으로 바꿔주면서 플레이어를 로테이션 함.
			}
			
			mapInfo(); 	// 맵정보

			Player curPlayer = playArr.get(idx); 										// 각 플레어마다 idx를 가지고와 순서를 정함.

			System.out.println();
			System.out.println(curPlayer.getName() + "님의 차례입니다.");
			System.out.println("주사위를 던져주세요(Enter)");
			scan.nextLine();

			int diceValue = dice(); 													// 주사위 합의 값을 가져온다.(주사위 메서드)

			if (curPlayer.getCounting() != 0) { 										// 무인도 카운팅을 위한 주사위 0으로 만들기.
				diceValue = 0;
			}
			
			int curLocation = curPlayer.getLocation(); 									// 위치 값을 가져온다.

			int nowloc = curLocation + diceValue; 										// 위치값에 주계속해서 주사위 값을 더한다.

			if (nowloc >= map.size()) { 												// 현재값이 city 배열의 사이즈보다 크거나 같으면
				nowloc = nowloc - map.size(); 											// 현재위치 - 사이즈값을 해준다..(계속해서 돌아가게 하기 위해)
				salary(curPlayer); 														// 시작점을 지나는 경우 +돈을 해주는 메서드
				input = scan.nextLine();
			}

			curPlayer.setLocation(nowloc); 												// 나온 값을 해당 플레이어 위치에 저장한다.

			mapInfo(); 	// 맵정보

			City curCity = map.get(curPlayer.getLocation()); 							// city배엘에 해당위치를 가져온다.
			
			
			// 빈땅
			if (curCity.getOwner() == 100 && curCity.getSpecial() != 2) {
				// 땅 주인id 값100 and 땅 특징 값이 0 ,1 (일반땅0, 관광지1, 특별한 땅2) 인 땅만 구매 가능하게 해야 함.

				
				System.out.println("현재위치: " + curCity.getName() + "  ||  도시 가격:" + curCity.getLandPrice() + "원");
				System.out.println("주인이 없는 도시 입니다. 사시겠습니까?  1)산다!! 부자가 될거야!  2)안사 안사~");
				System.out.println("현재 잔액:" + curPlayer.getMoney() + "원");
				input = scan.nextLine();
				
				if (input.equals("1")) {
					
					// 산다
					landbuy(curCity, curPlayer);										// 도시 구입하는 메서드

				} else {
					
					// 안삼
					System.out.println("아쉽지만 다음에 구매를..!!");
					input = scan.nextLine();
				}
			// 호텔 짓기.
			} else if (curCity.getOwner() == curPlayer.getId()							// 도시 ID와, 플레이어 ID가 일치 AND
					&& curCity.getHotelBoolean() == false								// 도시의 빌딩여부가 false AND
					&& curCity.getSpecial() == 0) {										// 도시의 특정한 값이 0인 도시는 호텔을 지을 수 있습니다.
				
				
				System.out.println("현재위치: " + curCity.getName() + "  ||  호텔 가격:" + curCity.getHotel() + "원");
				System.out.println("나의 도시 입니다. 호텔을 짓겠습니까~?  1)호텔을 짓자!  2)호텔은 나중에....!!");
				System.out.println("현재 잔액:" + curPlayer.getMoney() + "원");
				input = scan.nextLine();
				
				if (input.equals("1")) {
					
					// 호텔을 짓는다.
					hotelPay(curCity, curPlayer);										// 호텔 짓는 메서드
	
				} else {
					
					// 안 짓는다.				
					System.out.println("아쉽지만 다음 기회에..!!");
					input = scan.nextLine();
				}
			// 내 도시.
			} else if (curCity.getOwner() == curPlayer.getId()) {
							// 땅 ID와 사용자 ID가 같을 때
				
				// 내땅일때는 그냥 지나 턴넘김.
				System.out.println("현재위치: " + curCity.getName());
				System.out.println("내 땅 이 다 ! ! !");
				System.out.println();
				input = scan.nextLine();
			}

			else {
				
				// 남의 땅 or 특수한 땅.
				System.out.println("현재위치: " + curCity.getName());
				input = scan.nextLine();
				if (curCity.getHotelBoolean() == true) {								// 호텔 여부가 true 일 때
					
					System.out.println("호텔이 있는 곳에 도착 하셨네요.. 돈좀 나가겠는데요?");		// 호텔을 지은 도시에 걸렸을 경우
					input = scan.nextLine();
					
					payToPlayerH(curPlayer, curCity);									// 호텔 있는 도시에 걸렸을 때 메서드

				} else if (curCity.getSpecial() == 1 && curCity.getOwner() != 100) {	// 도시의 특정한 값이 1이며 AND 도시 주인이 100이 아닐경우
					
					System.out.println("관광지입니다~! 다행히, 호텔이 없는 곳이네요~");				// 관광지에 걸렸을 경우
					input = scan.nextLine();

					payToPlayerL(curPlayer, curCity);									// 관광지에 걸렸을 때 메서드

				} else if (curCity.getName().equals("접수처")) {					
					
					System.out.println("사회복지기금 접수처 입니다. 돈 내놓으세요..(15만원)");			
					input = scan.nextLine();
					int fund = 150000;													
					
					if(fund<curPlayer.getMoney()) {										
						curPlayer.setMoney(curPlayer.getMoney() - fund);	
						Fundm+=150000;
						
						System.out.println("접수 후 잔액: " + curPlayer.getMoney());	
						System.out.println("현재 모금된 복지기금: "+Fundm+"원");
						input = scan.nextLine();
					} else {
						System.out.println("돈이 부족해");
						while(curPlayer.getMoney()<150000) {
							if(!bankruptcy(curPlayer, curCity)) {
								break;
							}
							else if(curPlayer.getMoney()<150000) {
								continue;
							}
							else {
								curPlayer.setMoney(curPlayer.getMoney() - fund);
								Fundm+=150000;
								System.out.println("접수 후 잔액: " + curPlayer.getMoney());	
								System.out.println("현재 모금된 복지기금: "+Fundm+"원");
								input = scan.nextLine();
							}
							
						}
					}
					
				} else if (curCity.getName().equals("수령")) {					
					
					System.out.println("사회복지기금 수령하세요!!");
					System.out.println("현재까지 모인 기금: "+Fundm+"원");
					input = scan.nextLine();

					curPlayer.setMoney(curPlayer.getMoney() + Fundm);
					Fundm=0;
					System.out.println("접수 후 잔액: " + curPlayer.getMoney());
					input = scan.nextLine();

				} else if (curCity.getName().equals("시작점")) {
					
					System.out.println("시작점에 오셨네요. 보너스 드릴게용(30만원)");
					input = scan.nextLine();
					int pinMoney = 300000;
					
					curPlayer.setMoney(curPlayer.getMoney() + pinMoney);
					System.out.println("보너스 받은 후 잔액: " + curPlayer.getMoney());
					input = scan.nextLine();

				} else if (curCity.getName().equals("무인도")) {
					input = scan.nextLine();

					if (curPlayer.getCounting() == 2) {					// 카운팅이 2가 되면 
						// 탈출
						System.out.println("드디어 다음 주사위때 탈출이다!! ");
						curPlayer.setCounting(0);						// 카운팅을 0으로 변경한다.

					} else {
						curPlayer.counting();							// 카운팅을 숫자를 ++ 한다.
						System.out.println("얼른 내보내줘!! ||counting: " + curPlayer.getCounting());
						input = scan.nextLine();
						System.out.println();
						System.out.println();
					}

				} else if (curCity.getName().equals("세계여행")) {
					System.out.print("세계여행 당첨!!! 원하시는 곳을 적어주세용: ");
					input = scan.nextLine();

					for (int i = 0; i < map.size(); i++) {				// for문으로 도시을 돌리면서
						if (map.get(i).getName().equals(input))			// 만약에 도시이름과 입력한 도시이름이 같으면 
							curPlayer.setLocation(i);					// 도시 값을 플레이어 위치 값에 저장한다.
					}
					
					input = scan.nextLine();

				}
				
				else {
					
					System.out.println("도시 도착 하셨네요. 통행료 지불해주세요~");
					
					input = scan.nextLine();
					payToPlayerL(curPlayer, curCity);					// 통행료 메서드
				}
			}
			
			if (playArr.size() == 1) { // 플레이어가 한명만 남으면 while문을 나온다.
				gameEnd(); 
				break;
			}
			
			idx++; // 한 플레어이가 끝나고 ++되므로 다른 플레이어가 온다.

		}
		
	}

	public int dice() { // 주사위 굴리는 메서드

		DoubleStream ds = new Random().doubles(2, 1, 6);
		int num = (int) ds.sum();
		System.out.println("나온주사위: " + num);
		System.out.println();

		return num;
	}

	public void salary(Player curPlayer) { // 월급(시작점을 통과시 월급 지급)
		int salary = 200000;
		
		System.out.println("시작점을 지나셨습니다~");
		System.out.println("월급 드릴게용~(20만원)");
		curPlayer.setMoney(curPlayer.getMoney() + salary);
		System.out.println("월급 받은 후 잔액: " + curPlayer.getMoney());
	}

	public void mapInfo() { // 맵 정보

		List<Integer> pl = new ArrayList<>();
		for (int i = 0; i < playArr.size(); i++) {
			pl.add(playArr.get(i).getLocation()); // 각 플레이어의 위치 정보를 새로만든 ArrayList에 정보를 넣어준다.
		}
		for (int i = 0; i < map.size(); i++) { // map 사이즈 만큼 for 문을 돌리면서
			for (int j = 0; j < playArr.size(); j++) { // 플레이어 객체 사이즈 만큼 이중for문을 돌려서
				if (i == playArr.get(j).getLocation()) { // 맵위치와 플레이어 위치가 같을 때
					if (j == 0)
						System.out.print("☎"); // j값에 해당하는 말을 추가해준다.
					if (j == 1)
						System.out.print("♨");
					if (j == 2)
						System.out.print("♥");
					if (j == 3)
						System.out.print("▲");
				}
			} 
	        System.out.print("\033[H\033[2J");																				//화면 지우기 용도 깔끔하게 보이기 위해
	        System.out.flush();
	        
			System.out.println(map.get(i).getName() + "				||땅 값: " + map.get(i).getLandPrice() + " ||빌딩 값: "
					+ map.get(i).getHotel() + " ||땅통행료 값: " + map.get(i).getLandPay() + " ||빌딩통행료: "
					+ map.get(i).getHotelPay() + " ||땅주인 ID: " + map.get(i).getOwner() + " ||빌딩여부: "
					+ map.get(i).getHotelBoolean());
			
		}

	}

	public void landbuy(City curCity, Player curPlayer) { // 도시 사는 메서드

		int landPrice = curCity.getLandPrice();
		int money = curPlayer.getMoney();
		int id = curPlayer.getId();

		if (landPrice > money) {
			System.out.println("돈이 부족해");
			
			while(landPrice > money) {
				if(!bankruptcy(curPlayer, curCity)) {
					break;
				}
				else if(landPrice > money) {
					continue;
				}
				else {
					landbuy(curCity,curPlayer);
				}
				
			}
			
			
		} else {
			curPlayer.setMoney(money -= landPrice);
			curCity.setOwner(id);
			
			System.out.println("구매 후 잔액:" + curPlayer.getMoney());
			System.out.println();
		}
		
	}

	public void hotelPay(City curCity, Player curPlayer) { // 호텔 짓는 메서드
		int hotelPay = curCity.getHotel();
		int money = curPlayer.getMoney();

		if (hotelPay > money) {
			System.out.println("돈이 부족해");
			
			while(hotelPay > money) {
				if(!bankruptcy(curPlayer, curCity)) {
					break;
				}
				else if(hotelPay > money) {
					continue;
				}
				else {
					hotelPay(curCity,curPlayer);
				}
			}

		} else {
			curPlayer.setMoney(money -= hotelPay);
			curCity.setHotelBoolean(true);
			System.out.println("구매 후 잔액:" + curPlayer.getMoney());
			System.out.println();
		}
	}

	public void payToPlayerH(Player curPlayer, City curCity) { // 호텔지은 땅에 걸렸을 때 통행료.

		int money = curPlayer.getMoney();
		int cp = curCity.getHotelPay();

		System.out.println("통행료 지불전 금액:" + curPlayer.getMoney());

		if (cp > money) {
			System.out.println("돈이 부족해");
			
			while(cp > money) {
				if(!bankruptcy(curPlayer, curCity)) {
					break;
				}
				else if(cp > money) {
					continue;
				}
				else {
					curPlayer.setMoney(money -= cp);
					System.out.println("통행료: " + cp);
					System.out.println("남은 잔액: " + money);
					
				}
			}
			
		} else {
			
			curPlayer.setMoney(money -= cp);
			System.out.println("통행료: " + cp);
			System.out.println("남은 잔액: " + money);
		}
		
		for (int i = 0; i < playArr.size(); i++) {
			if (playArr.get(i).getId() == curCity.getOwner()) {
				int ownerMoney = playArr.get(i).getMoney();
				int c = ownerMoney + curCity.getHotelPay();
				playArr.get(i).setMoney(c);
				System.out.println("통행료 받은 후 금액:" + playArr.get(i).getMoney() + " " + playArr.get(i).getName());
			}
		}
		System.out.println("통행료 지불 후 금액:" + curPlayer.getMoney() + " " + curPlayer.getName());
	}

	public void payToPlayerL(Player curPlayer, City curCity) {	// 도시거나, 관광지에 걸렸을 때 통행료

		int money = curPlayer.getMoney();
		int cp = curCity.getLandPay();

		System.out.println("통행료 지불전 금액:" + curPlayer.getMoney());

		if (cp > money) {
			System.out.println("돈이 부족해");

			while(cp > money) {
				if(!bankruptcy(curPlayer, curCity)) {
					break;
				}
				else if(cp > money) {
					continue;
				}
				else {
					curPlayer.setMoney(money -= cp);
					System.out.println("통행료: " + cp);
					System.out.println("남은 잔액: " + money);
				}
			}
			
			
		} else {
			
			curPlayer.setMoney(money -= cp);
			System.out.println("통행료: " + cp);
			System.out.println("남은 잔액: " + money);

		}
		
		for (int i = 0; i < playArr.size(); i++) {
			if (playArr.get(i).getId() == curCity.getOwner()) {
				int ownerMoney = playArr.get(i).getMoney();
				int c = ownerMoney + curCity.getLandPay();
				playArr.get(i).setMoney(c);
				System.out.println(
						"통행료 받은 후 금액:" + playArr.get(i).getMoney() + " " + playArr.get(i).getName());
			}
		}
		System.out.println("통행료 지불 후 금액:" + curPlayer.getMoney() + " " + curPlayer.getName());
	}

	public boolean bankruptcy(Player curPlayer, City curCity) {	//돈이 부족할 때 나오는 메서드..
		
		Scanner scan = new Scanner(System.in);
		boolean ok = false;
		boolean ck = false;
		
		for(int i =0; i<map.size();i++) {
			if(map.get(i).getOwner()==curPlayer.getId()) {
				System.out.println("소유 도시 이름: "+map.get(i).getName()+"소유도시 가격:"+map.get(i).getLandPrice()+"소유호텔 가격:"+map.get(i).getHotel()+"호텔여부: "+map.get(i).getHotelBoolean());
				ck = true;
			}
		}
		if(ck == false) {
			System.out.println("가지고 있는 재산이 없습니다..");
			
		}
		
		System.out.print("1)파산  2)호텔 판매  3)도시 판매");
		String input = scan.next();
		if(input.equals("1")) {
			for(int i =0; i<map.size();i++) {
				if(map.get(i).getOwner()==curPlayer.getId()) {
					System.out.println(map.get(i).getName());
					System.out.println("가지고 있는 재산이 있습니다.!!");
					System.out.print("그래도 파산 하시겠습니까? 1)옙  2)아니요 팔게요..");
					input = scan.next();
					if(input.equals("1")) {
						System.out.println("파산되었습니다.");
						playArr.remove(curPlayer);
						ok = true;
						break;
						
					} else {
						bankruptcy(curPlayer, curCity);
						ok = true;
					}
					
				} 
				if(ok==false) {
					System.out.println("소유한 호텔 및 도시가 없으므로 파산되었습니다.");
					playArr.remove(curPlayer);
					System.out.println(playArr.size());
					break;
					
				}
			}
			return ok;
		} else if(input.equals("2")) {
			for(int i=0; i<map.size();i++) {
				if(map.get(i).getOwner()==curPlayer.getId()&&map.get(i).getHotelBoolean()==true) {
					System.out.println("소유한 호텔 명: "+map.get(i).getName()+"호텔 가격: "+map.get(i).getHotel());
				}
			}
			System.out.println("파실 호텔의 도시 명을 입력하세요!");
			input = scan.next();
			for(int i=0; i<map.size();i++) {
				if(map.get(i).getName().equals(input)) {
					map.get(i).setHotelBoolean(false);
					curPlayer.setMoney(curPlayer.getMoney()+map.get(i).getHotel());
					System.out.println("호텔을 판 후 잔액: " + curPlayer.getMoney());	
				}
			}
			return ok;
		} else {
			for(int i=0; i<map.size();i++) {
				if(map.get(i).getOwner()==curPlayer.getId()&&map.get(i).getHotelBoolean()==false) {
					System.out.println("소유한 도시 명: "+map.get(i).getName()+"도시 가격: "+map.get(i).getLandPrice());
				}
			}
			System.out.println("파실 도시 명을 입력하세요!");
			input = scan.next();
			for(int i=0; i<map.size();i++) {
				if(map.get(i).getName().equals(input)) {
					map.get(i).setOwner(100);
					curPlayer.setMoney(curPlayer.getMoney()+map.get(i).getLandPrice());
					System.out.println("도시를 판 후 잔액: " + curPlayer.getMoney());	
				}
			}
		}
		return ok;
	}
	
	public void gameEnd() { // 게임 끝
		System.out.println("게임이 종료 되었습니다.");
		for (int i = 0; i < playArr.size(); i++) {
			System.out.println("1등 플레이어: " + playArr.get(i).getName() + "  || 플레이어 돈: " + playArr.get(i).getMoney());
		}
	}


}
