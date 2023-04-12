package study21;

public class ThreadStateBasicRun {
	public static void main(String[] args) {
		Thread test = new Thread() {
			public void run() {
				for(long i=0;i<9999999L;i++) {}
			};
		};
		System.out.println(test.getState());
		test.start();
		System.out.println(test.getState());
		try {test.join();}catch(InterruptedException e) {}
		System.out.println(test.getState());
	}
}
