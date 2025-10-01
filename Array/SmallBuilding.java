class SmallBuilding{
	
	// I already had a Building named class so i named this class as SmallBuilding.
	
	
	public SmallBuilding(Floors [] floors){
		
		for(int number = 0;number<floors.length;number++){
			
			Floors floorDetails = floors[number];
			System.out.println("Floor Details = "+floorDetails);
			
		}
		
	}
	
}