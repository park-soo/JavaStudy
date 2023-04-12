package study21;



class Result{
	int result = 100;
	public void calResult() {
		int temp =result;
		System.out.println(temp);
		try {Thread.sleep(2500);}catch(InterruptedException e) {};
		
		result = result/2;
		System.out.println(result);
		
	}
}

class CalThread extends Thread {
	Result resultObj;
	public CalThread(Result result) {
		this.resultObj = result;
	}
	@Override
	public void run() {
		resultObj.calResult();
		System.out.println(getName()+" "+resultObj.result);
	}
}


public class NonSyncThreadRun {
	public static void main(String[] args) {
		
	Result resultObj = new Result();	//공유 객체
	Thread cal1 = new CalThread(resultObj);
	cal1.setName("no.1 thread");
	cal1.start();
	try {Thread.sleep(1000);}catch(InterruptedException e) {};
	Thread cal2 = new CalThread(resultObj);
	cal2.setName("no.2 thread");
	cal2.start();
	}
}
