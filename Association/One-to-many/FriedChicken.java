class FriedChicken{
	
	public int friedChickenPrice;
	public Chicken chicken;
	
	public FriedChicken(int friedChickenPrice,Chicken chicken){
		
		this.friedChickenPrice=friedChickenPrice;
		this.chicken=chicken;
		
	}
	
	public void displayFriedChickenInfo(){
		
		System.out.println("This is FriedChicken class.");
		System.out.println("The price of fried chicken = "+friedChickenPrice);
		System.out.println("The number of chickens used = "+chicken.numberOfChicken);
		
	}
	
}