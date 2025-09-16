class ECommerceInfoOneRunner{
	
	public static void main(String [] args){
		
		ECommerceInfoOne info = new ECommerceInfoOne();
		
		ECommerceOne detailsOne = new ECommerceOne("Flipkart","Flipkart.com");
		ECommerceOne detailsTwo = new ECommerceOne("Amazon","Amazon.com");
		ECommerceOne detailsThree = new ECommerceOne("Ajio","Ajio.com");
		ECommerceOne detailsFour = new ECommerceOne("Myntra","Myntra.com");
		
		ECommerceOne [] details = {detailsOne,detailsTwo,detailsThree,detailsFour};
		
		info.eCommerceDetails(details);
		
	}
	
}