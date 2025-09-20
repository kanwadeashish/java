class ChilliChicken{
	
	public int chilliChickenPrice;
	public Chicken chicken;
	
	public ChilliChicken(int chilliChickenPrice,Chicken chicken){
		
		this.chilliChickenPrice=chilliChickenPrice;
		this.chicken=chicken;
		
	}
	
	public void displayChilliChickenInfo(){
		
		System.out.println("This is ChilliChicken class.");
		System.out.println("The price of chilli chicken = "+chilliChickenPrice);
		System.out.println("The number of chickens used = "+chicken.numberOfChicken);
		
	}
	
}