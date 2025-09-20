class Omlet{
	
	public int omletPrice;
	public Egg egg;
	
	public Omlet(int omletPrice,Egg egg){
		
		this.omletPrice=omletPrice;
		this.egg=egg;
		
	}
	
	public void displayOmletDetails(){
		
		System.out.println("This is Omlet class.");
		System.out.println("Price of omlet = "+omletPrice);
		System.out.println("Number of eggs used = "+egg.eggsUsed);
		
	}
	
}