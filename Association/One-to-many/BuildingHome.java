class BuildingHome{
	
	public String buildingName;
	public SteelBars bars;
	
	public BuildingHome(String buildingName,SteelBars bars){
		
		this.buildingName=buildingName;
		this.bars=bars;
		
	}
	
	public void buildingHomeDetails(){
		
		System.out.println("This is Home building details.");
		System.out.println("Name of the building = "+buildingName);
		System.out.println("Required amount of steel bars for the building = "+bars.requiredAmountOfSteelBars);
		System.out.println("Total amount of steel bars = "+bars.totalAmount);
		
	}
	
}