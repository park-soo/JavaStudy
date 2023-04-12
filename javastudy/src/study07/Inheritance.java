package study07;


class Parent {
	
	int age;
	String name;
	
	public Parent() {
		name = "parent";
		System.out.println("parent() run");
	}
	
	
	public Parent(int age, String name) {
		this.age = age;
		this.name = name;
		System.out.println("parent(param) run");
	}
	
	
	public void showInfo() {
		System.out.println("이름: "+name+" /나이: "+age);
	}
	
}

class Child extends Parent {
	String name = "Child name";
	
	public Child() {
		System.out.println("child run");
	}
	
	public Child(int age, String name) {
		this.name = name;
		this.age = age;
		//super(age, name);
		System.out.println("Child(param) run");
	}
	
	//show info 오버라이드
	@Override // 어노테이션 annotation
	public void showInfo() {
		System.out.println("이름: "+name+"("+age+"살"+")");
	}
	
}



public class Inheritance {
	public static void main(String[] args) {
		
		Child c1 = new Child();
		System.out.println(c1.name);
		c1.showInfo();
		
		Parent p = new Child();
		System.out.println(p.name);	// 멤버변수는 앞의 객체에 따라 호출
		p.showInfo();				//	만든 객체의 메소르들 호출  //부모변수를 통해 만들어도 new Child면 Child안에 있는 showInfo값을 가지고 옴. // new Parent면 Parent안에 있는 showInfo값을 가지고 옴.
		
		Child c = new Child(10,"마리");
		c.showInfo();
		
	}
}
