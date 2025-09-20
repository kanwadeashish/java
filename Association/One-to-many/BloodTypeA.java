class BloodTypeA{
	
	public String bloodType;
	public BloodTypeO typeO;
	
	public BloodTypeA(String bloodType,BloodTypeO typeO){
		
		this.bloodType=bloodType;
		this.typeO=typeO;
		
	}
	
	public void displayTypeADetails(){
		
		System.out.println("This is BloodTypeA class.");
		System.out.println("The type of blood is = "+bloodType);
		System.out.println("The compatible blood type is = "+typeO.bloodType);
		
	}
	
}