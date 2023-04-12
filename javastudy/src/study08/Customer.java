package study08;

public class Customer {
	
	static int seqNum = 1000;
	
	//멤버변수
	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	//생성자
	public Customer() {
		customerId = seqNum++;
		customerGrade = "Silver";		// 초기값을 실버로 지정
		bonusRatio = 0.01;				// 1퍼
		System.out.println("Customer 생성자");
	}
	// 이름을 매개변수(파라미터)로 받는 생성자를 생성.
	public Customer(String customerName) {
		this();
		this.customerName = customerName;
	}
	
	//메소드
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price;
	}
	
	//메소드
	public String getCustomerInfo() {
		return "이름:"+customerName+"|등급:"+customerGrade+"|보너스포인트:"+bonusPoint;
	}
	

	
	//getter setter
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
}
