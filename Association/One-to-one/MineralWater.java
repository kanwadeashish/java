class MineralWater{
	
	public String waterQuantity;
	public WaterBottle bottle;
	
	public MineralWater(String waterQuantity,WaterBottle bottle){
		
		this.waterQuantity=waterQuantity;
		this.bottle=bottle;
		
	}
	
	public void displayDetails(){
		
		System.out.println("The amount of water present in bottle is = "+waterQuantity);
		System.out.println("The price of water bottle is = "+bottle.price);
		
	}
	
}