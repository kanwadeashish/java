class ButterChicken{
	
	public int butterChickenPrice;
	public Chicken chicken;
	
	public ButterChicken(int butterChickenPrice,Chicken chicken){
		
		this.butterChickenPrice=butterChickenPrice;
		this.chicken=chicken;
		
	}
	
	public void displayButterChickenInfo(){
		
		System.out.println("This is ButterChicken class.");
		System.out.println("The price of butter chicken = "+butterChickenPrice);
		System.out.println("The number of chickens used = "+chicken.numberOfChicken);
		
	}
	
}