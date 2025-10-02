class BigApartmentRunner{
	
	public static void main(String [] args){
		
		BigApartment apartment=new BigApartment();
		
		ApartmentFloors floor = new ApartmentFloors();
		
		ApartmentFloors floor1=new ApartmentFloors(1,"Apple");
		ApartmentFloors floor2=new ApartmentFloors(2,"Ball");
		ApartmentFloors floor3=new ApartmentFloors(3,"Cat");
		ApartmentFloors floor4=new ApartmentFloors(4,"Dog");
		ApartmentFloors floor5=new ApartmentFloors(5,"Empty");

		ApartmentFloors [] floors={floor1,floor2,floor3,floor4,floor5};
		
		apartment.apartments(floors);
		
		ApartmentRooms roomOne = new ApartmentRooms(1,"One",123456789L,8.8,'a',true);
		ApartmentRooms roomTwo = new ApartmentRooms(2,"Two",223456789L,8.8,'a',true);
		ApartmentRooms roomThree = new ApartmentRooms(3,"Three",323456789L,8.8,'a',true);
		ApartmentRooms roomFour = new ApartmentRooms(4,"Four",423456789L,8.8,'a',true);
		ApartmentRooms roomFive = new ApartmentRooms(5,"Five",523456789L,8.8,'a',true);
		ApartmentRooms roomSix = new ApartmentRooms(6,"Six",623456789L,8.8,'a',true);
		ApartmentRooms roomSeven = new ApartmentRooms(7,"Seven",723456789L,8.8,'a',true);
		ApartmentRooms roomEight = new ApartmentRooms(8,"Eight",823456789L,8.8,'a',true);
		ApartmentRooms roomNine = new ApartmentRooms(9,"Nine",923456789L,8.8,'a',true);
		ApartmentRooms roomTen = new ApartmentRooms(10,"Ten",103456789L,8.8,'a',true);

		ApartmentRooms [] rooms = {roomOne,roomTwo,roomThree,roomFour,roomFive,roomSix,roomSeven,roomEight,roomNine,roomTen};
		
		floor.displayRooms(rooms);
		
	}
}