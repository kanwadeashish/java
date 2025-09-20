class HotelMenuRunner{
	
	public static void main(String[]args){
		
		HotelMenu menu = new HotelMenu("Biryani",15);
		
		Hotel hotel = new Hotel("Delicious","Bangalore",menu);
		
		menu.display();
		hotel.hotelMenuInfo();
		
	}
	
}