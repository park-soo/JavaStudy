package study21;


class SharedClass{
	private int sum=0;
	public void add(int x) {
		Thread.yield();
		System.out.println(Thread.currentThread().getName()+"start");
		sum+=x;
		System.out.println(Thread.currentThread().getName()+"end");
	}
	
	public void getSum() {
		System.out.println(sum);
	}
}


public class YieldThreadRun {
	public static void main(String[] args) {
		SharedClass sc = new SharedClass();
		Thread t1 = new Thread() {
			public void run() {
				sc.add(13);
				sc.getSum();
			};
		};
		Thread t2 = new Thread() {
			public void run() {
				sc.add(10);sc.getSum();
			};
		};
		t1.start();
		t2.start();
		sc.getSum();
	}
}






