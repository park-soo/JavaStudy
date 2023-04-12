package study07;

class Animal {
	String name;
	public void setName(String name) {
		this.name = name;
	}
	
	void sleep() {
		System.out.println("zzzzzz");
	}
}

class Dog extends Animal {
	
	void sleep() {
		System.out.println(name+" 으르렁 으르렁");
	}
	
}

class Cat extends Animal {
	void sleep() {
		System.out.println(name+ " 야아아앙옹");
	}
}

class Human extends Animal {
	void sleep() {
		System.out.println(name + " 크아아아아앙");
	}
	
}

class PetDog extends Dog {
	
	PetDog() {}
	
	PetDog(String name) {
		this.setName(name);
		
	}
	
	
	@Override		// annotation 어노테이션(컴파일러한테 설명을 해주는 주석)
	void sleep() {
		System.out.println(name+" 골골 겔겔 쿨쿨 콜콜");
	}
	
	//오버로딩
	void sleep(int hours) {
		System.out.println(name+"는 "+ hours+"시간동안 잘 잡니다.");
	}
	
	
}



public class AnimalRun {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.setName("멍멍이");
		System.out.println(dog.name);
		dog.sleep();
		
		System.out.println();
		
		Cat cat = new Cat();
		cat.setName("야옹이");
		System.out.println(cat.name);
		cat.sleep();
		
		System.out.println();
		
		Human human = new Human();
		human.setName("홍길동");
		System.out.println(human.name);
		human.sleep();

		System.out.println();
		
		PetDog petDog = new PetDog();
		petDog.setName("해피해피");
		System.out.println(petDog.name);
		petDog.sleep();
		petDog.sleep(5);
		
		System.out.println();
		
		// 자식 클래스의 객체는 부모 클래스의 자료형으로 사용가능(is-a 관계(이즈-어 관계))
		Animal dog2 = new Dog();			// 부모클래스의 변수로 선언 가능		// Dog is a Animal
		
		dog2.setName("강아지");
		dog2.sleep();
		
		// Dog animal = new Animal();			// 오류발생 Animal is a Dog x
		// 형변환 필수
		// Dog animal = (Dog)new Animal();		
		
		Dog dog3 = new PetDog("해피");
		
		dog3.sleep();
		
		
		
		
		
		
		
		
		
		
	}
}
