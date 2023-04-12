package study09;

class People {
	String name;

	public void setName(String name) {
		this.name = name;
	}

	public void showInfo() {
		System.out.println(name + "사람");
	}

	public void eatFood() {
		System.out.println(name + "음식을 먹습니다.");
	}
}

class Male extends People {

	@Override
	public void showInfo() {
		// super.showInfo(); //상위에 있는걸 쓰고 싶으면 super로 불러온다.
		System.out.println(name + "남자");
	}
}

class Female extends People {
	@Override
	public void showInfo() {
		// super.showInfo(); //상위에 있는걸 쓰고 싶으면 super로 불러온다.
		System.out.println(name + "여자");
	}

}

public class PersonRun {
	public static void main(String[] args) {

		Male m = new Male();
		Female f = new Female();

		m.showInfo();
		f.showInfo();

		People pp = new Male(); // 업 캐스팅
		pp.showInfo(); // 오버라이딩된 메소드를 호출
		pp = new Female(); // 업 캐스팅 // 대입연산자로 new Male이 없어짐.
		pp.showInfo(); // 오버라이딩된 메소드를 호출
		
		pp.eatFood();

		// instanceof
		if (pp instanceof Female) {
			System.out.println("Female instance");
		}
		if (pp instanceof Male) {
			System.out.println("Male instance");
		}
		if (pp instanceof People) {
			System.out.println("People instance");
		}
		if (pp instanceof Object) {
			System.out.println("Object instance");
		}

		People p = new People();
		People pm = new Male();
		People pf = new Female();
		p.showInfo();
		pm.showInfo();
		pf.showInfo();

		People[] pArr = new People[3];
		pArr[0] = new People();
		pArr[1] = new Male();
		pArr[2] = new Female();
		for (int i = 0; i < pArr.length; i++) {
			pArr[i].showInfo();
		}

		whoAreYou(p);
		whoAreYou(pm);
		whoAreYou(pf);

		// 다운 캐스팅
		People p2 = new Male();
		p2.showInfo();
		Male m2 = (Male) p2;
		m2.showInfo();
		// Male m3 = (Male) new People(); //People만 있기 때문에 Male에 넣을 순 없음.
		// Female f2 = (Female)new Book(); //부모자식 관계가 없는 것도 불가능.

	}

	public static void whoAreYou(People p) {
		p.setName("선미");
		p.showInfo();
	}

}
