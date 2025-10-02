class SmallApartmentRunner{
	
	public static void main(String [] args){
		
		SmallApartment apartment=new SmallApartment();
		
		Floors floor = new Floors();
		
		Floors floor1=new Floors(1,"Apple");
		Floors floor2=new Floors(2,"Ball");
		Floors floor3=new Floors(3,"Cat");
		Floors floor4=new Floors(4,"Dog");
		Floors floor5=new Floors(5,"Empty");

		Floors [] floors={floor1,floor2,floor3,floor4,floor5};
		
		apartment.apartments(floors);
		
		Rooms roomOne = new Rooms(1,"One",123456789L,8.8,'a',true);
		Rooms roomTwo = new Rooms(2,"Two",223456789L,8.8,'a',true);
		Rooms roomThree = new Rooms(3,"Three",323456789L,8.8,'a',true);
		Rooms roomFour = new Rooms(4,"Four",423456789L,8.8,'a',true);
		Rooms roomFive = new Rooms(5,"Five",523456789L,8.8,'a',true);
		Rooms roomSix = new Rooms(6,"Six",623456789L,8.8,'a',true);
		Rooms roomSeven = new Rooms(7,"Seven",723456789L,8.8,'a',true);
		Rooms roomEight = new Rooms(8,"Eight",823456789L,8.8,'a',true);
		Rooms roomNine = new Rooms(9,"Nine",923456789L,8.8,'a',true);
		Rooms roomTen = new Rooms(10,"Ten",103456789L,8.8,'a',true);

		Rooms [] rooms = {roomOne,roomTwo,roomThree,roomFour,roomFive,roomSix,roomSeven,roomEight,roomNine,roomTen};
		
		floor.displayRooms(rooms);
		
	}
}