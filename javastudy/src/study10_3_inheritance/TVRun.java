package study10_3_inheritance;

public class TVRun {
	public static void main(String[] args) {
		ColorTV ctv = new ColorTV(32, 1024) ;		// size, resolution
		ctv.printProperty();	//자식에만 있는 메서드 이기 때문에 TV를 자료형으로 객체를 생성했을 때에는 사용이 불가.
		//32인치 1024컬러
		
		IPTV iptv = new IPTV("192.1.1.4", 64,2048);	//address, size, resolution
		iptv.printProperty();
		//IPTV는 192.1.1.4 주소의 64인치 2048컬러
		
	}
}
