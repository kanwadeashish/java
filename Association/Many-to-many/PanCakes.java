class PanCakes{
	
	public String dishName;
	public Flour flour;
	public WaterTemperature water;
	public Salt salt;
	
	public PanCakes(String dishName,Flour flour,WaterTemperature water,Salt salt){
		
		this.dishName=dishName;
		this.flour=flour;
		this.water=water;
		this.salt=salt;
		
	}
	
	public void displayPanCakesDetails(){
		
		System.out.println("This is items required to make PanCakes.");
		System.out.println("Name of the dish = "+dishName);
		System.out.println("Type of floor required = "+flour.typeOfFlour);
		System.out.println("Water temperature required = "+water.temperatureOfWater);
		System.out.println("Type of salt required = "+salt.typeOfSalt);
		
	}
	
}