class ApartmentBuilding{
	
	public String buildingName;
	public Cement cement;
	public Sand sand;
	public Bricks bricks;
	
	public ApartmentBuilding(String buildingName,Cement cement,Sand sand,Bricks bricks){
		
		this.buildingName=buildingName;
		this.cement=cement;
		this.sand=sand;
		this.bricks=bricks;
		
	}
	
	public void displayApartmentBuildingInfo(){
		
		System.out.println("This is Materials Required for building Apartment.");
		System.out.println("The Name of the building = "+buildingName);
		System.out.println("The number of cement bags required = "+cement.numberOfBags);
		System.out.println("How much ton sand is required = "+sand.numberOfTons);
		System.out.println("Number of bricks required = "+bricks.numberOfBricks);
		
	}
	
}