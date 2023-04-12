package study03;

public class WrapperClassRun {
	public static void main(String[] args) {
		int a = 10;
		Integer num = 10; 	//오토 박싱(auto boxing)
		int n = num;		//오토 언박싱
		n = num.intValue();	//언박싱
		
		String str1 = "100";
		String str2 = "3.14";
		String str3 = "false";
		
		byte b = Byte.parseByte(str1);
		System.out.println(b);
		int i = Integer.parseInt(str1);
		System.out.println(i);
		short s = Short.parseShort(str1);
		System.out.println(s);
		long l = Long.parseLong(str1);
		System.out.println(l);
		 
		float f = Float.parseFloat(str2);
		System.out.println(f);
		double d = Double.parseDouble(str2);
		System.out.println(d);
		
		boolean bool = Boolean.parseBoolean(str3);
		System.out.println(bool);
		
		
		String number1 = new String("1234");
		String number2 = new String("4321");
		System.out.println(number1 + number2);
		
		int num1 = Integer.parseInt(number1);
		int num2 = Integer.parseInt(number2);

		System.out.println(num1 + num2);
		
		
	}
}
