package javaProject_01;

public class City {
	private String name;
	
	private int owner = 100;		
	private int landPrice;							//도시 값
	private int landPay;							//도시에 걸렸을 때
	private int hotel;								//호텔 지을때 가격
	private int hotelPay;							//호텔 걸렸을 때 가격
	private boolean hotelBoolean = false;			//호텔의 여부확인
	private int special;							//1이면 관광지, 2이면 특별한 칸


	//일반 도시
	public City(String name, int landPrice, int landPay,int hotel, int hotelPay) {		//생성자 생성
		this.name = name;
		this.landPrice = landPrice;
		this.landPay = landPay;
		this.hotel = hotel;
		this.hotelPay = hotelPay;
	}
	
	//관광지
	public City(String name, int landPrice, int landPay, int special) {		//생성자 생성
		this.name = name;
		this.landPrice = landPrice;
		this.landPay = landPay;
		this.special = special;
		
	}
	//특별한 칸
	public City(String name,int special) {		//생성자 생성
		this.name = name;
		this.special = special;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOwner() {
		return owner;
	}

	public void setOwner(int owner) {
		this.owner = owner;
	}

	public int getLandPrice() {
		return landPrice;
	}

	public void setLandPrice(int landPrice) {
		this.landPrice = landPrice;
	}

	public int getHotel() {
		return hotel;
	}

	public void setHotel(int hotel) {
		this.hotel = hotel;
	}

	public int getHotelPay() {
		return hotelPay;
	}

	public void setHotelPay(int hotelPay) {
		this.hotelPay = hotelPay;
	}

	public boolean getHotelBoolean() {
		return hotelBoolean;
	}

	public void setHotelBoolean(boolean hotelBoolean) {
		this.hotelBoolean = hotelBoolean;
	}

	public int getLandPay() {
		return landPay;
	}

	public void setLandPay(int landPay) {
		this.landPay = landPay;
	}

	public int getSpecial() {
		return special;
	}

	public void setSpecial(int special) {
		this.special = special;
	}



	
}
