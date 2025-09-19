class ChickenTikka{
	
	public int chickenTikkaPrice;
	public Chicken chicken;
	
	public ChickenTikka(int chickenTikkaPrice,Chicken chicken){
		
		this.chickenTikkaPrice=chickenTikkaPrice;
		this.chicken=chicken;
		
	}
	
	public void displayChickenTikkaInfo(){
		
		System.out.println("This is ChickenTikka class.");
		System.out.println("The price of chicken tikka = "+chickenTikkaPrice);
		System.out.println("The number of chickens used = "+chicken.numberOfChicken);
		
	}
	
}