class TandooriChicken{
	
	public int tandooriChickenPrice;
	public Chicken chicken;
	
	public TandooriChicken(int tandooriChickenPrice,Chicken chicken){
		
		this.tandooriChickenPrice=tandooriChickenPrice;
		this.chicken=chicken;
		
	}
	
	public void displayTandooriChickenInfo(){
		
		System.out.println("This is TandooriChicken class.");
		System.out.println("The price of tandoori chicken = "+tandooriChickenPrice);
		System.out.println("The number of chickens used = "+chicken.numberOfChicken);
		
	}
	
}