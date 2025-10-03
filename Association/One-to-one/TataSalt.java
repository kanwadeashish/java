class TataSalt{
	
	public String saltQuantity;
	public SaltPacket salt;
	
	public TataSalt(String saltQuantity,SaltPacket salt){
		
		this.saltQuantity=saltQuantity;
		this.salt=salt;
		
	}
	
	public void displayDetails(){
		
		System.out.println("The amount of salt present in packet is = "+saltQuantity);
		System.out.println("The price of salt packet is = "+salt.price);
		
	}
	
}