class LemonTea{
	
	public int teaPrice;
	public String shopName;
	public CommonSugar sugar;
	
	public LemonTea(int teaPrice,String shopName,CommonSugar sugar){
		
		this.teaPrice=teaPrice;
		this.shopName=shopName;
		this.sugar=sugar;
		
	}
	
	public void displayLemonTea(){
		
		System.out.println("This is LemonTea class");
		System.out.println("Price of Lemon tea = "+teaPrice);
		System.out.println("Name of the shop = "+shopName);
		System.out.println("Number of spoons = "+sugar.numberOfSpoons);
		System.out.println("Is the sugar Sugarless = "+sugar.isSugarLess);
		
	}
	
}