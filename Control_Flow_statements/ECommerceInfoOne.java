class ECommerceInfoOne{
	
	public void eCommerceDetails(ECommerceOne [] eCommerce){
		
		//This is normal for loop.
		//for(int num = 0;num<eCommerce.length; num++){
		//	ECommerceOne display = eCommerce[num];
		//	display.eCommerceInfo();
		//}
		
		//This is for loop written differently.
		for(ECommerceOne display : eCommerce){
			
			display.eCommerceInfo();
			
		}
		
	}
	
}