package salaryTest;

public class Test {
	public static void main(String[] args) {

		Developer tom = new Developer("Tom",5);
		System.out.println(tom.salary()+"만원");
		System.out.println(tom.level());
		Developer john = new Developer("John",8);
		System.out.println(john.salary()+"만원");
		System.out.println(john.level());
		Developer james = new Developer("James",1);
		System.out.println(james.salary()+"만원");
		System.out.println(james.level());
		
		
		Corperation corp = new Corperation("Google");
		
		
		Developer kate = new Developer("Kate",20);
		System.out.println(kate.salary()+"만원");
		System.out.println(kate.level());
		
		corp.addDeveloper(tom);
		corp.addDeveloper(james);
		corp.addDeveloper(john);
		corp.addDeveloper(kate);
		
		
		System.out.println(corp.salayExpen()+"만원");
		
		

	}
}
