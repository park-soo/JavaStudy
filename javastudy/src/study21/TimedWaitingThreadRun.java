package study21;

class TimedThread extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted Exception 발생");
			for (long i = 0; i < 9999999999999L; i++) {
			}
		}
	}
}

public class TimedWaitingThreadRun {
	public static void main(String[] args) {
		Thread t = new TimedThread();
		t.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {}
		System.out.println(t.getState());
		t.interrupt();
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {}
		System.out.println(t.getState());

	}
}
