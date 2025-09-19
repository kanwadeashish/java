class Burji{
	
	public int burjiPrice;
	public Egg egg;
	
	public Burji(int burjiPrice,Egg egg){
		
		this.burjiPrice=burjiPrice;
		this.egg=egg;
		
	}
	
	public void displayBurjiDetails(){
		
		System.out.println("This is Burji class.");
		System.out.println("Price of burji = "+burjiPrice);
		System.out.println("Number of eggs used = "+egg.eggsUsed);
		
	}
	
}