class ColdCoffee{
	
	public int coldCoffeePrice;
	public String shopName;
	public CommonSugar sugar;
	
	public ColdCoffee(int coldCoffeePrice,String shopName,CommonSugar sugar){
		
		this.coldCoffeePrice=coldCoffeePrice;
		this.shopName=shopName;
		this.sugar=sugar;
		
	}
	
	public void displayColdCoffee(){
		
		System.out.println("This is ColdCoffee class");
		System.out.println("Price of cold coffee = "+coldCoffeePrice);
		System.out.println("Name of the shop = "+shopName);
		System.out.println("Number of spoons = "+sugar.numberOfSpoons);
		System.out.println("Is the sugar Sugarless = "+sugar.isSugarLess);
		
	}
	
}