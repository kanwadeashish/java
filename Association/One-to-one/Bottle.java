class Bottle{
	
	public int price;
	public Water water;
	
	public Bottle(int price){
		
		this.price=price;
		
	}
	
	public void displayInfo(Water water){
		
		this.water=water;
		System.out.println("The price of bottle is = "+price);
		
	}
	
}