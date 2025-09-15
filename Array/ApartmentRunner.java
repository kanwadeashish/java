class ApartmentRunner{
	
	public static void main(String [] args){
		Apartment apartment=new Apartment();
		Floor floor1=new Floor(1,"Apple");
		Floor floor2=new Floor(2,"Ball");
		Floor floor3=new Floor(3,"Cat");
		Floor floor4=new Floor(4,"Dog");

	Floor [] floor={floor1,floor2,floor3,floor4};
	apartment.apartments(floor);

}
}