class Idli{
	
	public int price;
	public Samber samber;
	
	public Idli(int price){
		
		this.price=price;
		
	}
	
	public void displayInfo(Samber samber){
		
		this.samber=samber;
		System.out.println("The price of idli is = "+price);
		
	}
	
}