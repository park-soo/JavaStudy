package study21;

import java.time.LocalTime;

class JoinThread extends Thread{
	@Override
	public void run() {
		System.out.println(LocalTime.now()+"thread start");
		try {Thread.sleep(10000);}catch(InterruptedException e) {
			System.out.println("Interrupt 발생");
		}
		System.out.println(LocalTime.now()+"thread end");
	}
}

public class JoinThreadRun {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new JoinThread();
		System.out.println(LocalTime.now()+"쓰레드 시작");
		thread.start();
		System.out.println(LocalTime.now()+"쓰레드 종료 대기");
		
		//시간대가 없으면, 나말고 다른놈 끝나고 가지만, 시간대가 있으면 그 시간대만 멈추고 갈길 간다.	
		//나보다 먼저 계산(실행)이 끝나야 될 놈들한테 join을 걸어준다... 
		thread.join(3000);											
													
		System.out.println(LocalTime.now()+"쓰레드 종료여부 확인"+thread.isAlive());
	}
}
