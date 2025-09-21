class SwiftVehicle{
	
	public String vehicleBrand;
	public int vehiclePrice;
	public Tyre tyre;
	public Seats seats;
	public Engine engine;
	
	public SwiftVehicle(String vehicleBrand,int vehiclePrice,Tyre tyre,Seats seats,Engine engine){
		
		this.vehicleBrand=vehicleBrand;
		this.vehiclePrice=vehiclePrice;
		this.tyre=tyre;
		this.seats=seats;
		this.engine=engine;
		
	}
	
	public void displaySwiftVehicleInfo(){
		
		System.out.println("This is SwiftVehicle class.");
		System.out.println("Brand of the vehicle = "+vehicleBrand);
		System.out.println("Price of the vehicle = "+vehiclePrice);
		System.out.println("Brand of the tyre = "+tyre.tyreBrand);
		System.out.println("Number of the tyres required = "+tyre.numberOfTyresRequired);
		System.out.println("Number of the Seats required = "+seats.numberOfSeatsRequired);
		System.out.println("Material of the Seats required = "+seats.materialOfSeat);
		System.out.println("The number of cylinders of engine = "+engine.numberOfCylinders);
		System.out.println("The CC of the engine = "+engine.engineCC);
		
	}
	
}