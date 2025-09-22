class HotTea{
	
	public int hotTeaPrice;
	public TeaPowder powder;
	public HotMilk milk;
	public NormalSugar sugar;
	
	public HotTea(int hotTeaPrice,TeaPowder powder,HotMilk milk,NormalSugar sugar){
		
		this.hotTeaPrice=hotTeaPrice;
		this.powder=powder;
		this.milk=milk;
		this.sugar=sugar;
		
	}
	
	public void hotTeaDetails(){
		
		System.out.println("This is hot tea details.");
		System.out.println("Price of Hot tea = "+hotTeaPrice);
		System.out.println("Tea powder brand = "+powder.teaPowderBrand);
		System.out.println("State of the milk = "+milk.stateOfMilk);
		System.out.println("Number of spoons sugar added = "+sugar.numberOfSugarSpoons);
		
	}
	
}