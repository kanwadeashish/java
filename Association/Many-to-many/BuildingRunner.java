class BuildingRunner{
	
	public static void main(String[]args){
		
		Cement cementForSchool = new Cement(20000);
		Cement cementForHouse = new Cement(10000);
		Cement cementForApartment = new Cement(30000);
		
		Sand sandForSchool = new Sand(200);	
		Sand sandForHouse = new Sand(100);	
		Sand sandForApartment = new Sand(300);	
		
		Bricks bricksForSchool = new Bricks(22222);
		Bricks bricksForHouse = new Bricks(11111);
		Bricks bricksForApartment = new Bricks(33333);
		
		SchoolBuilding school = new SchoolBuilding("School",cementForSchool,sandForSchool,bricksForSchool);
		
		HouseBuilding house = new HouseBuilding("House",cementForHouse,sandForHouse,bricksForHouse);
		
		ApartmentBuilding apartment = new ApartmentBuilding("Apartment",cementForApartment,sandForApartment,bricksForApartment);
		
		school.displaySchoolBuildingInfo();
		house.displayHouseBuildingInfo();
		apartment.displayApartmentBuildingInfo();
		
	}
	
}