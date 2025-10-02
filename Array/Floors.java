class Floors{
	
	public int numberOfFloors;
	public String floorNames;
	
	public Floors(){
		
		System.out.println("This Shows the information about Floors,");
		
	}

	public Floors(int numberOfFloors,String floorNames){
		
		this.numberOfFloors=numberOfFloors;
		this.floorNames=floorNames;
		
	}
	
	public void floorsInfo(){
		
		System.out.println("Floor Number = "+numberOfFloors);
		System.out.println("Floor Name = "+floorNames);
		
	}
	
	public void displayRooms(Rooms[] room){
		
		for(int num=0; num<room.length; num++){
			
			Rooms roomDetails=room[num];
	
			roomDetails.roomsInfo();
		}
	}
	
}