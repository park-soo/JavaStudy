package study09;

public abstract class NoteBook extends Computer{
	
	// 추상메서드를 구현하지 않으면 추상크래스가 된다.  //상속받은 Computer가 추상클래스
	@Override
	public void display() {
		System.out.println("노트북 모니터");
	}
	
	
	
	
}
