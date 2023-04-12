package study10_2;

public class AdvancedLevel implements PlayerLevelInterface{
	@Override
	public void run() {
		System.out.println("달려 달려 달려");
	}

	@Override
	public void jump() {
		System.out.println("덩크 슛");
	}

	@Override
	public void turn() {
		System.out.println("샤샤샤샷");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("AdvancedLevel>>>>>>>>>>>");
	}

	@Override
	public void hack() {
		System.out.println("으아아아아");
	}

	@Override
	public void slash() {
		System.out.println("슈슉! 슈숙!");

	}
}
