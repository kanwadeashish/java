class Tea{
	
	public int price;
	public Sugar sugar;
	
	public Tea(int price){
		
		this.price=price;
		
	}
	
	public void displayInfo(Sugar sugar){
		
		this.sugar=sugar;
		System.out.println("The price of tea is = "+price);
		
	}
	
}