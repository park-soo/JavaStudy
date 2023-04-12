package study08;

public class VipCustomer extends Customer {
		
		private double saleRatio;	//할인율
		private Manager manager;	//
		
		public VipCustomer(String customerName, String managerName) {
			super(customerName);
			customerGrade = "VIP";
			bonusRatio = 0.05;
			saleRatio = 0.1;
			System.out.println("VIPcustomer 생성자");
			manager = new Manager(managerName);
			
			
		}
		
		@Override
		public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price-(int)(price*saleRatio);		// int * double  형변환
		}

		@Override
		public String getCustomerInfo() {
			
			return super.getCustomerInfo()+"|매니저:"+manager.getManagerName();
		}
		
		public Manager getManager() {
			return manager;
		}
		
		
		
		
	
}
