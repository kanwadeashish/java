class AppleRunner{
	
	public static void main(String [] args){
		
		Apple apple = new Apple();
		
		apple.companyName("Apple");
		apple.mobilePrice(85000);
		apple.companyName("Apple",'a');
		apple.mobilePrice(85000,true);
		
	}
	
}