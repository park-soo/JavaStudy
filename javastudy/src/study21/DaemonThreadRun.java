package study21;


class CoThread extends Thread{
	@Override
	public void run() {
		
		System.out.println(getName());
		if(isDaemon()) {
			for(int i=0;i<10;i++) {
				System.out.println("      ■"+i);
				try {Thread.sleep(1000);}
				catch(InterruptedException e) {}
			}
		} else {
			for(int i=0;i<7;i++) {
				System.out.println("▼"+i);
				try {Thread.sleep(1000);}
				catch(InterruptedException e) {}
			}
		}
		
		
	}
}

public class DaemonThreadRun {
	public static void main(String[] args) {
		
		Thread normal = new CoThread();
		normal.setName("normal Thread");
		normal.setDaemon(false);
		normal.start();
		
		Thread daemon = new CoThread();
		daemon.setName("daemon Thread");
		daemon.setDaemon(true);
		daemon.start();
		
		
		try {
			Thread.sleep(4000);
		}catch(InterruptedException e) {}
		
		System.out.println("main Thread terminated");
		
	}
}
