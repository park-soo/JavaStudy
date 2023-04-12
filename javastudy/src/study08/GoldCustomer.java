package study08;

public class GoldCustomer extends Customer{ //생성자는 물려받지 않는당.

	//멤버변수
	private double saleRatio;	//할인율
	
	//생성자
	public GoldCustomer(String customerName) {
		super(customerName);
		customerGrade = "Gold";
		bonusRatio = 0.03;		//3퍼센트 //보너스적립금
		saleRatio = 0.05;		//5퍼센트 //할인율
		System.out.println("Gold customer 생성자");
		
	}
	//메소드  //오버라이딩
	@Override
	public int calcPrice(int price) {
	bonusPoint += price*bonusRatio;
	return price-(int)(price*saleRatio);		// int * double  형변환
	}                   
	
}