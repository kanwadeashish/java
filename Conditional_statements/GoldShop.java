class GoldShop{
	
	public boolean isAvailable(String productName){
		
		if(productName=="Ring"){
			System.out.println("The ring is available.");
			return true;
		}else if(productName=="Necklace"){
			System.out.println("The necklace is available");
			return true;
		}else{
			System.out.println("The desired product is not available.");
			return false;
		}
		
	}
	
}