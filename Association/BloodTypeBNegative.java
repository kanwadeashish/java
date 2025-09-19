class BloodTypeBNegative{
	
	public String bloodType;
	public BloodTypeO typeO;
	
	public BloodTypeBNegative(String bloodType,BloodTypeO typeO){
		
		this.bloodType=bloodType;
		this.typeO=typeO;
		
	}
	
	public void displayTypeBNegativeDetails(){
		
		System.out.println("This is BloodTypeBNegative class.");
		System.out.println("The type of blood is = "+bloodType);
		System.out.println("The compatible blood type is = "+typeO.bloodType);
		
	}
	
}