class InfoOfCustomer{
	
	public void takingInputArray(CustomerInfo[] info){
		
		for(int num=0;num<info.length;num++){
			
			CustomerInfo print=info[num];
			print.displayCustomerInfo();
			
		}
		
	}
	
}