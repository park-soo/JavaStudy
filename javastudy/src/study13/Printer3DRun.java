package study13;

//인터페이스
interface Material {

	// 추상 메서드
	public abstract void doPrinting();

}

//일반클래스 인터페이스 구현

class Powder implements Material {

	// 부모클래스 메서드 오버라이딩(object)
	@Override
	public String toString() {

		return "사용물질: 파우더";
	}

	// 인터페이스 추상메서드 오바리이딩(Material)
	@Override
	public void doPrinting() {
		System.out.println("파우더 제품 제작중...");

	}

}

class Plastic implements Material {

	@Override
	public String toString() {

		return "사용물질: 플라스틱";
	}

	@Override
	public void doPrinting() {
		System.out.println("플라스틱 제품 제작중...");

	}

}

class Print3D<T extends Material> {
	// 필드
	private T maerial;

	// getter setter
	public T getMaterial() {
		return maerial;
	}

	public void setMaterial(T material) {
		this.maerial = material;
	}

	@Override
	public String toString() {
		return maerial.toString();
	}

	public void printing() {
		maerial.doPrinting();
	}

}

public class Printer3DRun {
	public static void main(String[] args) {
		Print3D<Powder> pPo = new Print3D<>();
		pPo.setMaterial(new Powder());
		System.out.println(pPo.toString());
		pPo.printing();

		System.out.println();

		Print3D<Plastic> pPo1 = new Print3D<>();
		pPo1.setMaterial(new Plastic());
		System.out.println(pPo1.toString());
		pPo1.printing();

		System.out.println();

		Print3D<Material> pMa = new Print3D<>();
		pMa.setMaterial(new Plastic());
		System.out.println(pMa.toString());
		pMa.printing();
		pMa.setMaterial(new Powder());
		System.out.println(pMa.toString());
		pMa.printing();

	}
}
