package study21;


class SyncBlockResult{
	int result = 10;
	public void minusResult() {
		synchronized (this) {
			int temp = result;
			try {Thread.sleep(2000);}catch(InterruptedException e) {};
			result -=1;
		}
	}
}

class MinusThread extends Thread{
	SyncBlockResult sbres;
	public MinusThread(SyncBlockResult sbres) {
		this.sbres = sbres;
	}
	@Override
	public void run() {
		sbres.minusResult();
		System.out.println(getName()+" "+sbres.result);
	}
}


public class SyncBlockThreadRun {
	public static void main(String[] args) {
		SyncBlockResult sb = new SyncBlockResult();
		
		Thread th1 = new MinusThread(sb);
		th1.setName("no1 thread");
		th1.start();
		
		try {Thread.sleep(1000);}catch(InterruptedException e ) {};
		
		Thread th2 = new MinusThread(sb);
		th2.setName("no2 thread");
		th2.start();
		
		
		
		
		
		
	}
}
