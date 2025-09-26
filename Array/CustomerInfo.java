class CustomerInfo{

	public String customerName;
	public int id;
	public long phoneNumber;
	
	public CustomerInfo(String studentName,int id,long phoneNumber){
		
		this.customerName=customerName;
		this.id=id;
		this.phoneNumber=phoneNumber;
		
	}
	
	public void displayCustomerInfo(){
		
		System.out.println("The name of the customer is = "+customerName);
		System.out.println("The id of the customer is = "+id);
		System.out.println("The phone Number of the customer is = "+phoneNumber);
		
	}

}