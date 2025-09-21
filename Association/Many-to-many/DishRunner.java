class DishRunner{
	
	public static void main(String[]args){
		
		Flour flourForChapathi = new Flour("Wheat Flour");
		Flour flourForPasta = new Flour("Semolina Flour");
		Flour flourForPanCakes = new Flour("All Purpose Flour");
		
		WaterTemperature waterForChapathi = new WaterTemperature("Luke Warm Water");
		WaterTemperature waterForPasta = new WaterTemperature("Boiling Water");
		WaterTemperature waterForPanCakes = new WaterTemperature("Room-Temperature Water");
		
		Salt saltForChapathi = new Salt("Plain table Salt");
		Salt saltForPasta = new Salt("Koshar or Sea Salt");
		Salt saltForPanCakes = new Salt("Fine Grade Sea Salt");
		
		Chapathi chapathi = new Chapathi("Chapathi",flourForChapathi,waterForChapathi,saltForChapathi);
		
		Pasta pasta = new Pasta("Pasta",flourForPasta,waterForPasta,saltForPasta);
		
		PanCakes cakes = new PanCakes("PanCakes",flourForPanCakes,waterForPanCakes,saltForPanCakes);
		
		chapathi.displayChapathiDetails();
		pasta.displayPastaDetails();
		cakes.displayPanCakesDetails();
		
	}
	
}