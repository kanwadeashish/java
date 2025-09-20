class EggSandwich{
	
	public int eggSandwichPrice;
	public Egg egg;
	
	public EggSandwich(int eggSandwichPrice,Egg egg){
		
		this.eggSandwichPrice=eggSandwichPrice;
		this.egg=egg;
		
	}
	
	public void displayEggSandwichDetails(){
		
		System.out.println("This is EggSandwich class.");
		System.out.println("Price of Egg Sandwich = "+eggSandwichPrice);
		System.out.println("Number of eggs used = "+egg.eggsUsed);
		
	}
	
}