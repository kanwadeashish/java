class Vehicle{
	
	public int price;
	public static String colour;
	
	public void showPrice(){
		
		System.out.println("The price of the Nano car before reassigning is = "+price);
		price=120;
		System.out.println("The price of the Nano car after reassigning is = "+price);
		
	}
	public static void showColour(){
		
		System.out.println("The colour of the Nano before reassigning car is = "+colour);
		colour="Black";
		System.out.println("The colour of the Nano car after reassigning is = "+colour);
		
	}
	
}