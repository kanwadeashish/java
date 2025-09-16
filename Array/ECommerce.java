class ECommerce{ 
	
	public String eCommerceName ;
	public String eCommerceWebSite ;
	
	public ECommerce(String eCommerceName,String eCommerceWebSite){
		
		this.eCommerceName=eCommerceName;
		this.eCommerceWebSite=eCommerceWebSite;
		
	}
	
	public void eCommerceInfo(){
		
		System.out.println("E-Commerce Name = "+eCommerceName+" E-Commerce Website = "+eCommerceWebSite);
		
	}
	
}