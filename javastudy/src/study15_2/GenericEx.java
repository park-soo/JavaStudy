package study15_2;

public class GenericEx {
	public static void main(String[] args) {
		Integer[] intArr = {1,2,3};
		String[] strArr = {"Hello","World"};
		
		
		printArray(intArr);
		printArray(strArr);
		
		
	}

	private static <T> void printArray(T[] t) {
		for(T a  : t) {
			System.out.println(a);
		}
	}
	

	
}
