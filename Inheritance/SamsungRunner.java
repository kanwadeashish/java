class SamsungRunner{
	
	public static void main(String [] args){
		
		Samsung samsung = new Samsung();
		
		samsung.companyName("Samsung");
		samsung.mobilePrice(50000);
		samsung.companyName("Samsung",'a');
		samsung.mobilePrice(50000,true);
		
	}
	
}