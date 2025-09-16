class FloorOne{
	
	public int noOfFloors;
	public String floorDetails;

	public FloorOne(int noOfFloors,String floorDetails){
		
		this.noOfFloors=noOfFloors;
		this.floorDetails=floorDetails;
		
	}
	
	public void floorInfo(){
		
		System.out.println("Number of floors = "+noOfFloors+" Floor Details = "+floorDetails);
		
	}
	
}