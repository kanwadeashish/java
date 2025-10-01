class SmallBuildingRunner{
	
	public static void main(String [] args){
		
		Rooms roomOne = new Rooms(1,"Ajay",123456789L,8.8,'a',true);
		Rooms roomTwo = new Rooms(2,"Sujay",267856789L,8.8,'a',true);
		Rooms roomThree = new Rooms(3,"Vijay",378916789L,8.8,'a',true);
		Rooms roomFour = new Rooms(4,"Ganesh",478916789L,8.8,'a',true);
		Rooms roomFive = new Rooms(5,"Zoro",578916789L,8.8,'a',true);
		Rooms roomSix = new Rooms(6,"Nami",678916789L,8.8,'a',true);
		Rooms roomSeven = new Rooms(7,"Robin",778916789L,8.8,'a',true);
		Rooms roomEight = new Rooms(8,"Luffy",878916789L,8.8,'a',true);
		Rooms roomNine = new Rooms(9,"Vega",978916789L,8.8,'a',true);
		Rooms roomTen = new Rooms(10,"Punk",108916789L,8.8,'a',true);
		
		Rooms [] roomDetails = {roomOne,roomTwo,roomThree,roomFour,roomFive,roomSix,roomSeven,roomEight,roomNine,roomTen};
		
		Floors floorOne = new Floors(roomDetails );
		Floors floorTwo = new Floors(roomDetails);
		Floors floorThree = new Floors(roomDetails);
		Floors floorFour = new Floors(roomDetails);
		Floors floorFive = new Floors(roomDetails);
		
		Floors [] floorsDetails = {floorOne,floorTwo,floorThree,floorFour,floorFive};
		
		SmallBuilding building = new SmallBuilding(floorsDetails);
		
	}
	
}