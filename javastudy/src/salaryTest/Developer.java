package salaryTest;

public class Developer{
	private String name;
	private int career = 0;

	public Developer(String name, int career) {
		this.name = name;
		this.career = career;

	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCareer() {
		return career;
	}
	public void setCareer(int career) {
		this.career = career;
	}



	public String level() {
		if (career >= 7) {
			
			//System.out.println("고급 개발자");
			return "고급 개발자";
			
		} else if (career >= 3) {
			
			//System.out.println("중급 개발자");
			return "중급 개발자";
			
		} else {
			
			//System.out.println("초급 개발자");
			return "초급 개발자";
		}
	}

	public int salary() {
		if (career >= 7) {
			
			return 4500 + (100 * career);
			
		} else if (career >= 3) {
			
			return 3500 + (100 * career);
			
		} else {
			
			return 2800 + (100 * career);
		}
	}

}
