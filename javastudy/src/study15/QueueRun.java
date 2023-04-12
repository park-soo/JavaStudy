package study15;

import java.util.LinkedList;
import java.util.Queue;

public class QueueRun {
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		queue.add("나");
		queue.add("너");
		queue.add("우리");
		System.out.println(queue.element());
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		queue.offer("You");
		queue.offer("Me");
		queue.offer("We");
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		//System.out.println(queue.element());			//예외 java.util.NoSuchElementException
		//System.out.println(queue.remove());			//예외 java.util.NoSuchElementException
		
		
		
		
		
		
		
	}
}
