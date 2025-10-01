class Floors{
	
	public Floors(Rooms [] rooms){
		
		for(int number = 0;number<rooms.length;number++){
			
			Rooms roomsDetails = rooms[number];
			System.out.println("Rooms Details = "+roomsDetails);
			
		}
		
	}
	
}