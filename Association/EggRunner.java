class EggRunner{
	
	public static void main(String[]args){
		
		Egg twoEggs = new Egg(2);
		Egg threeEggs = new Egg(3);
		Egg fourEggs = new Egg(4);
		Egg fiveEggs = new Egg(5);
		
		Burji burji = new Burji(45,twoEggs);
		Omlet omlet = new Omlet(50,threeEggs);
		EggRice rice = new EggRice(60,fourEggs);
		EggSandwich sandwich = new EggSandwich(70,fiveEggs);
		
		burji.displayBurjiDetails();
		omlet.displayOmletDetails();
		rice.displayEggRiceDetails();
		sandwich.displayEggSandwichDetails();
		
	}
	
}