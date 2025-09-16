class ApartmentOneRunner{
	
	public static void main(String [] args){
		ApartmentOne apartment=new ApartmentOne();
		FloorOne floor1=new FloorOne(1,"Apple");
		FloorOne floor2=new FloorOne(2,"Ball");
		FloorOne floor3=new FloorOne(3,"Cat");
		FloorOne floor4=new FloorOne(4,"Dog");

	FloorOne [] floor={floor1,floor2,floor3,floor4};
	apartment.apartments(floor);

}
}