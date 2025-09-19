class ChickenCurry{
	
	public int chickenCurryPrice;
	public Chicken chicken;
	
	public ChickenCurry(int chickenCurryPrice,Chicken chicken){
		
		this.chickenCurryPrice=chickenCurryPrice;
		this.chicken=chicken;
		
	}
	
	public void displayChickenCurryInfo(){
		
		System.out.println("This is ChickenCurry class.");
		System.out.println("The price of chicken curry = "+chickenCurryPrice);
		System.out.println("The number of chickens used = "+chicken.numberOfChicken);
		
	}
	
}