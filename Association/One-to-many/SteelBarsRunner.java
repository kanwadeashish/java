class SteelBarsRunner{
	
	public static void main(String[]args){
		
		SteelBars barsForHome = new SteelBars(10000,100000);
		SteelBars barsForSchool = new SteelBars(20000,200000);
		
		BuildingHome home = new BuildingHome("Home",barsForHome);
		BuildingSchool school = new BuildingSchool("School",barsForSchool);
		
		home.buildingHomeDetails();
		school.buildingSchoolDetails();
		
	}
	
}