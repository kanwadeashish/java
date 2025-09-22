class Passenger{
	
	public String passengerName;
	public Driver driver;
	
	public Passenger(String passengerName,Driver driver){
		
		this.passengerName=passengerName;
		this.driver=driver;
		
	}
	
	public void displayPassengerDetails(){
		
		System.out.println("This is Passenger details.");
		System.out.println("Name of the passenger = "+passengerName);
		System.out.println("Name of the driver = "+driver.driverName);
		System.out.println("Cost of the ride = "+driver.rideCost);
		
	}
	
}