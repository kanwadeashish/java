class BloodTypeB{
	
	public String bloodType;
	public BloodTypeO typeO;
	
	public BloodTypeB(String bloodType,BloodTypeO typeO){
		
		this.bloodType=bloodType;
		this.typeO=typeO;
		
	}
	
	public void displayTypeBDetails(){
		
		System.out.println("This is BloodTypeB class.");
		System.out.println("The type of blood is = "+bloodType);
		System.out.println("The compatible blood type is = "+typeO.bloodType);
		
	}
	
}