class EggRice{
	
	public int eggRicePrice;
	public Egg egg;
	
	public EggRice(int eggRicePrice,Egg egg){
		
		this.eggRicePrice=eggRicePrice;
		this.egg=egg;
		
	}
	
	public void displayEggRiceDetails(){
		
		System.out.println("This is EggRice class.");
		System.out.println("Price of egg rice = "+eggRicePrice);
		System.out.println("Number of eggs used = "+egg.eggsUsed);
		
	}
	
}