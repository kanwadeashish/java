class ApartmentFloors{
	
	public int numberOfFloors;
	public String floorNames;
	
	public ApartmentFloors(){
		
		System.out.println("This Shows the information about Floors,");
		
	}

	public ApartmentFloors(int numberOfFloors,String floorNames){
		
		this.numberOfFloors=numberOfFloors;
		this.floorNames=floorNames;
		
	}
	
	public void floorsInfo(){
		
		System.out.println("Floor Number = "+numberOfFloors);
		System.out.println("Floor Name = "+floorNames);
		
	}
	
	public void displayRooms(ApartmentRooms[] room){
		
		for(int num=0; num<room.length; num++){
			
			ApartmentRooms roomDetails=room[num];
	
			roomDetails.roomsInfo();
		}
	}
	
}