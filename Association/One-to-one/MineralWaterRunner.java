class MineralWaterRunner{
	
	public static void main(String [] args){
		
		WaterBottle bottle = new WaterBottle(20);
		
		MineralWater water = new MineralWater("1 Liter",bottle);
		
		water.displayDetails();
		
	}
	
}