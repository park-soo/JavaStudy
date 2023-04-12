package salaryTest;

import java.util.ArrayList;

public class Corperation  {
	
	private String name;
	private ArrayList<Developer> developers;
	
	public Corperation(String name) {
		developers = new ArrayList<>();
		this.name = name;
	}
	
	
	public int salayExpen() {
		int total =0;
		for(Developer developer :developers) {
			total += developer.salary();
		}
		return total;
		
	}
	
	public void addDeveloper(Developer developer) {
		developers.add(developer);
	}
	
}
