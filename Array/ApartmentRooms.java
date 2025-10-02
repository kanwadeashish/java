class ApartmentRooms{
	
	public int numberOfRooms;
	public String roomName;
	public long phoneNumber;
	public double tax;
	public char rating;
	public boolean isSafe;

	public ApartmentRooms(int numberOfRooms,String roomName,long phoneNumber,double tax,char rating,boolean isSafe){
		
		this.numberOfRooms=numberOfRooms;
		this.roomName=roomName;
		this.phoneNumber=phoneNumber;
		this.tax=tax;
		this.rating=rating;
		this.isSafe=isSafe;
		
	}
	
	public void roomsInfo(){
		
		System.out.println("Room Number = "+numberOfRooms);
		System.out.println("Room Name = "+roomName);
		System.out.println("Room owner phone number = "+phoneNumber);
		System.out.println("Tax = "+tax);
		System.out.println("Room rating = "+rating);
		System.out.println("Room is safe = "+isSafe);
		
	}
	
}