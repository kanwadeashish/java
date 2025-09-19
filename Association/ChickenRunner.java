class ChickenRunner{
	
	public static void main(String[]args){
		
		Chicken oneChick = new Chicken(1);
		Chicken twoChick = new Chicken(2);
		Chicken threeChick = new Chicken(3);
		Chicken fourChick = new Chicken(4);
		Chicken fiveChick = new Chicken(5);
		Chicken sixChick = new Chicken(6);
		
		FriedChicken fried = new FriedChicken(100,oneChick);
		TandooriChicken tandoori = new TandooriChicken(150,twoChick);
		ButterChicken butter = new ButterChicken(200,threeChick);
		ChickenTikka tikka = new ChickenTikka(250,fourChick);
		ChickenCurry curry = new ChickenCurry(300,fiveChick);
		ChilliChicken chilli = new ChilliChicken(350,sixChick);
		
		fried.displayFriedChickenInfo();
		tandoori.displayTandooriChickenInfo();
		butter.displayButterChickenInfo();
		tikka.displayChickenTikkaInfo();
		curry.displayChickenCurryInfo();
		chilli.displayChilliChickenInfo();
		
		
	}
	
}