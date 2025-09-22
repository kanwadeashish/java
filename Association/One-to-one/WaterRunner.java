class WaterRunner{
	
	public static void main(String [] args){
		
		Bottle bottle = new Bottle(20);
		Water water = new Water("One litre");
		
		bottle.displayInfo(water);
		water.display();
		
		
	}
	
}