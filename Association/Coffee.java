class Coffee{
	
	public int coffeePrice;
	public String shopName;
	public CommonSugar sugar;
	
	public Coffee(int coffeePrice,String shopName,CommonSugar sugar){
		
		this.coffeePrice=coffeePrice;
		this.shopName=shopName;
		this.sugar=sugar;
		
	}
	
	public void displayCoffee(){
		
		System.out.println("This is Coffee class");
		System.out.println("Price of coffee = "+coffeePrice);
		System.out.println("Name of the shop = "+shopName);
		System.out.println("Number of spoons = "+sugar.numberOfSpoons);
		System.out.println("Is the sugar Sugarless = "+sugar.isSugarLess);
		
	}
	
}