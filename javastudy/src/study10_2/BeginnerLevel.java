package study10_2;

public class BeginnerLevel implements PlayerLevelInterface {

	@Override
	public void run() {
		System.out.println("살살");
	}

	@Override
	public void jump() {
		System.out.println("살짝");
	}

	@Override
	public void turn() {
		System.out.println("느릿느릿");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("BeginnerLevel>>>>>>>>>>>");
	}

	@Override
	public void hack() {
		System.out.println("빠샤");
	}

	@Override
	public void slash() {
		System.out.println("~슥~삭~슥~삭");

	}

}
