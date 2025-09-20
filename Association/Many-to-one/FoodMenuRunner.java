class FoodMenuRunner{
	
	public static void main(String[]args){
		
		Dosa dosa = new Dosa(45);
		Paratha paratha = new Paratha(50);
		Samosa samosa = new Samosa(20);
		
		FoodMenu menu = new FoodMenu("Aaswad",3,dosa,paratha,samosa);
		
		menu.displayFoodMenuInfo();
		
	}
	
}