package test1;

interface Mineral {
	
	public int getValue();
}

class Gold implements Mineral{

	@Override
	public int getValue() {
		return 100;
	}
	
}

class Silver implements Mineral{

	@Override
	public int getValue() {
		return 90;
	}
	
}

class Bronze implements Mineral{

	@Override
	public int getValue() {
		return 80;
	}
	
}

class MineralCalculator {
	int value = 0;
	
	public void add(Mineral min) {
		value += min.getValue();
	}
	
	public int getValue() {
		return value;
	}
	
}

public class Exam09 {

	public static void main(String[] args) {
		MineralCalculator cal = new MineralCalculator();
		
		Gold gold = new Gold();
		Silver silver = new Silver();
		Bronze bronze = new Bronze();
		
		cal.add(gold);
		cal.add(silver);
		cal.add(bronze);
		
		System.out.println(cal.getValue());
		
		
		

	}
}
