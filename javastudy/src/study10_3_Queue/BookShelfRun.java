package study10_3_Queue;

public class BookShelfRun {
	public static void main(String[] args) {

		
		BookShelf b = new BookShelf();		// 자기자신
		b.enQueue("수학의 정석1");
		b.enQueue("수학의 정석2");
		b.deQueue();
		b.deQueue2();
		
		Queue q = new BookShelf();			// 인터페이스
		q.enQueue("태백산맥1");
		q.enQueue("태백산맥2");
		q.enQueue("태백산맥3");
		q.enQueue("태백산맥4");
		q.deQueue();
		//q.deQueue2();
			
		Shelf s = new BookShelf();			// 상속
		//s.deQueue();
		//s.deQueue();
		
		
		System.out.println(q.deQueue());
		System.out.println(q.getSize());
		System.out.println(q.deQueue());
		System.out.println(q.getSize());
	}
}
