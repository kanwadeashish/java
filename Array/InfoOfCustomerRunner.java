class InfoOfCustomerRunner{
	
	public static void main(String[]args){
		
		InfoOfCustomer info = new InfoOfCustomer();
		
		CustomerInfo one = new CustomerInfo("Ajay",1,123456789L);
		CustomerInfo two = new CustomerInfo("Vijay",2,567856789L);
		CustomerInfo three = new CustomerInfo("Sujay",3,678916789L);
		
		
		CustomerInfo[] customerInfo = {one,two,three};
		
		info.takingInputArray(customerInfo);
		
	}
	
}