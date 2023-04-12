package study10_3_inheritance;

public class ColorTV extends TV {
	
	private int resolution;
	
	public int getResolution(){
		return resolution;
	}
	
	
	public ColorTV(int size, int resolution) {
		super(size);
		this.resolution = resolution;
	}
	
	public void printProperty() {
		System.out.println(getSize()+"인치 "+resolution+"컬러");
	}
	
}
