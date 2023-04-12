package javaProject_01;

public class Player {					//플레이어 id, 이름, 위치, 가지고 있는 돈
	private int id;
	private String name;
	private int location = 0;
	private int money = 6000000;
	private int counting = 0;				//무인도 머물게 하는 거.
	
	
	public Player(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getId() {
		return id;
	}
	

	public int getCounting() {
		return counting;
	}

	public void setCounting(int counting) {
		this.counting = counting;
	}

	public void counting() {		//무인도 카운팅.
		++counting;
			
	}
}
