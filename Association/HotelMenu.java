class HotelMenu{
	
	public String specialty;
	public int numberOfItems;
	
	public HotelMenu(String specialty,int numberOfItems){
		
		this.specialty=specialty;
		this.numberOfItems=numberOfItems;
		
	}
	
	public void display(){
		
		System.out.println("This is HotelMenu class.");
		System.out.println("Specialty of hotel ="+specialty);
		System.out.println("Number of items ="+numberOfItems);
		
	}

}