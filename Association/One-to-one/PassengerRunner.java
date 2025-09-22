class PassengerRunner{
	
	public static void main(String[]args){
		
		Driver driver = new Driver("John",200);
		Passenger passenger = new Passenger("Cena",driver);
		
		passenger.displayPassengerDetails();
		
	}
	
}