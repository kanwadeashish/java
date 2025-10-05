class NokiaRunner{
	
	public static void main(String [] args){
		
		Nokia nokia = new Nokia();
		
		nokia.companyName("Nokia");
		nokia.mobilePrice(5000);
		nokia.companyName("Nokia",'a');
		nokia.mobilePrice(5000,true);
		
	}
	
}