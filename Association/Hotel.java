class Hotel{
	
	public String hotelName;
	public String location;
	public HotelMenu hotelmenu;
	
	public Hotel(String hotelName,String location,HotelMenu hotelmenu){
		
		this.hotelName=hotelName;
		this.location=location;
		this.hotelmenu=hotelmenu;
		
	}
	
	public void hotelMenuInfo(){
		
		System.out.println("This is Hotel class.");
		System.out.println("Hotel Name = "+hotelName);
		System.out.println("Hotel Location = "+location);
		System.out.println("Menu Specialty = "+hotelmenu.specialty);
		System.out.println("Number of items on the menu = "+hotelmenu.numberOfItems);
		
	}
	
}