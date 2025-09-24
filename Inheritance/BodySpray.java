class BodySpray{
	
	public int price;
	public static String theme;
	
	public void showPrice(){
		
		System.out.println("The price is = "+price);
		price=300;
		System.out.println("The price after reassigning is = "+price);
		
	}
	public static void showTheme(){
		
		System.out.println("The theme is = "+theme);
		theme="Chandan";
		System.out.println("The theme after reassigning is = "+theme);
		
	}
	
}