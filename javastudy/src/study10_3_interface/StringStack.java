package study10_3_interface;

public class StringStack implements Stack{

	private String[] stack;
	private int top;
	
	public StringStack(int capacity) {
		stack = new String[capacity];
		top= -1;						//배열의 인덱스를 확인하기 위해...
	}
	
	@Override
	public int length() { 		// 0 1 2 3 4 
		
		return top+1;
	}

	@Override
	public int capacity() { 	// 1 2 3 4 5 6 7 8 9 10

		return stack.length;
	}

	@Override
	public String pop() {
		if(top==-1) return null;
		
		String str = stack[top];
		top--;
		return str;
	}

	@Override
	public boolean push(String value) {
		if(top == stack.length-1) {
			return false;
		} else {
			top++;
			stack[top] = value;
			return true;
		}
	}
	
}
