class BuildingSchool{
	
	public String buildingName;
	public SteelBars bars;
	
	public BuildingSchool(String buildingName,SteelBars bars){
		
		this.buildingName=buildingName;
		this.bars=bars;
		
	}
	
	public void buildingSchoolDetails(){
		
		System.out.println("This is School building details.");
		System.out.println("Name of the building = "+buildingName);
		System.out.println("Required amount of steel bars for the building = "+bars.requiredAmountOfSteelBars);
		System.out.println("Total amount of steel bars = "+bars.totalAmount);
		
	}
	
}