class Box{
	
	public static void table(){
		System.out.println("The table is in the room.");
	}
	
	public static void box(){
		table();
		System.out.println("The box is on the table.");
	}
	
	public static void food(){
		box();
		System.out.println("The food is in the box.");
	}
	
}