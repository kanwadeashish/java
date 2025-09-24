class Doctor{
	
	public int chargesOfCheckUp;
	public static String nameOfDoctor;
	
	public void showCharges(){
		
		System.out.println("The charges of the checkup is = "+chargesOfCheckUp);
		chargesOfCheckUp=150;
		System.out.println("The charges of the checkup after reassigning is = "+chargesOfCheckUp);
		
	}
	public static void showNameOfDoctor(){
		
		System.out.println("The name of the doctor is = "+nameOfDoctor);
		nameOfDoctor="Gundu";
		System.out.println("The name of the doctor after reassigning is = "+nameOfDoctor);
		
	}
	
}