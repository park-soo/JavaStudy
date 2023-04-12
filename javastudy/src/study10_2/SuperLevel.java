package study10_2;

public class SuperLevel implements PlayerLevelInterface{

	@Override
	public void run() {
		System.out.println("우사인볼트");
	}

	@Override
	public void jump() {
		System.out.println("마이클조던");
	}

	@Override
	public void turn() {
		System.out.println("김연아");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("SuperLevel>>>>>>>>>>>");
	}

	@Override
	public void hack() {
		System.out.println("!!!!!!!!!!!!!!!!");
	}

	@Override
	public void slash() {
		System.out.println("스윽!샥!슉!");

	}
}
