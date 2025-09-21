class VehicleRunner{
	
	public static void main(String[]args){
		
		Tyre tyreForNano = new Tyre("MRF",4);
		Tyre tyreForSwift = new Tyre("CEAT",4);
		Tyre tyreForOmni = new Tyre("Apollo",4);
		
		Seats seatsForNano = new Seats(4,"Nylon");
		Seats seatsForSwift = new Seats(5,"Leather");
		Seats seatsForOmni = new Seats(6,"Polyster");
		
		Engine engineForNano = new Engine(4,666);
		Engine engineForSwift = new Engine(8,999);
		Engine engineForOmni = new Engine(6,888);
		
		NanoVehicle nano = new NanoVehicle("Tata",100000,tyreForNano,seatsForNano,engineForNano);
		
		SwiftVehicle swift = new SwiftVehicle("Maruti Suzuki",1000000,tyreForSwift,seatsForSwift,engineForSwift);
		
		OmniVehicle omni = new OmniVehicle("Maruti",500000,tyreForOmni,seatsForOmni,engineForOmni);
		
		nano.displayNanoVehicleInfo();
		swift.displaySwiftVehicleInfo();
		omni.displayOmniVehicleInfo();
		
	}
	
}