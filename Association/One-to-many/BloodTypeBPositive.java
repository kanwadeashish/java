class BloodTypeBPositive{
	
	public String bloodType;
	public BloodTypeO typeO;
	
	public BloodTypeBPositive(String bloodType,BloodTypeO typeO){
		
		this.bloodType=bloodType;
		this.typeO=typeO;
		
	}
	
	public void displayTypeBPositiveDetails(){
		
		System.out.println("This is BloodTypeBPositive class.");
		System.out.println("The type of blood is = "+bloodType);
		System.out.println("The compatible blood type is = "+typeO.bloodType);
		
	}
	
}