package study14;

import java.util.Arrays;
import java.util.Vector;

public class VectorRun {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<>();

		Vector<String> vec2 = new Vector<>(Arrays.asList("사과", "오렌지", "망고", "배"));
		
		System.out.println(vec2);
		vec2.add("귤");
		vec2.addElement("감");
		System.out.println(vec2);
		System.out.println(vec2.size());
		System.out.println(vec2.capacity());		//저장공간 범위가 있으나, 사이즈 조정을 알아서 해줌.
		vec2.add("귤");
		vec2.add("귤");
		vec2.add("귤");
		System.out.println(vec2.capacity());		//저장공간 범위가 있으나, 사이즈 조정을 알아서 해줌.
		
		System.out.println(vec2.remove(7));
		System.out.println(vec2.remove("귤"));
		System.out.println(vec2);
		System.out.println(vec2.contains("망고"));
		System.out.println(vec2.indexOf("사과"));
		System.out.println(vec2.elementAt(1));		//get과 흡사함.
		System.out.println(vec2.get(1));
		System.out.println(vec2.firstElement());
		System.out.println(vec2.lastElement());
		System.out.println(vec2);
		System.out.println(vec2.set(6, "수박"));
		System.out.println(vec2);
		vec2.setElementAt("파파야", 2);
		System.out.println(vec2);
		vec2.clear();
		System.out.println(vec2);
		System.out.println(vec2.isEmpty());
		
		
		
		
		
	}

}
