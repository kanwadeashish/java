class Fruit{
	
	public int price;
	public static String fruitState;
	
	public void showPrice(){
		
		System.out.println("The price of the mango is = "+price);
		price=50;
		System.out.println("The price of the mango after reassigning is = "+price);
		
	}
	public static void showFruitState(){
		
		System.out.println("The state of the mango is = "+fruitState);
		fruitState="Raw";
		System.out.println("The state of the mango after reassigning is = "+fruitState);
		
	}
	
}