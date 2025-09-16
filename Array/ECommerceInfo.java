class ECommerceInfo{
	
	public void eCommerceDetails(ECommerce [] eCommerce){
		
		for(int num = 0;num<eCommerce.length; num++){
			
			ECommerce display = eCommerce[num];
			
			display.eCommerceInfo();
			
		}
		
	}
	
}