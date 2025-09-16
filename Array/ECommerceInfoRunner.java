class ECommerceInfoRunner{
	
	public static void main(String [] args){
		
		ECommerceInfo info = new ECommerceInfo();
		
		ECommerce detailsOne = new ECommerce("Flipkart","Flipkart.com");
		ECommerce detailsTwo = new ECommerce("Amazon","Amazon.com");
		ECommerce detailsThree = new ECommerce("Ajio","Ajio.com");
		ECommerce detailsFour = new ECommerce("Myntra","Myntra.com");
		
		ECommerce [] details = {detailsOne,detailsTwo,detailsThree,detailsFour};
		
		info.eCommerceDetails(details);
		
	}
	
}