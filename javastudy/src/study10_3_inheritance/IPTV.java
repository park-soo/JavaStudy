package study10_3_inheritance;

public class IPTV extends ColorTV{
	
	private String address;
	
	public String getAddress() {
		return address;
	}
	
	public IPTV(String address, int size, int resolution) {
		super(size,resolution);
		this.address = address;
	}
	
	@Override
	public void printProperty() {
		System.out.println("IPTV는 "+getAddress()+" 주소의 "+getSize()+"인치 "+getResolution()+"컬러");
		System.out.printf("IPTV는 %s 주소의 %d인치 %d컬러",getAddress(),getSize(),getResolution());
	}
	
}


