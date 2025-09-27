class DesignerSuit{
	
	public String productName;
	public int productPrice;
	public char productRating;
	public Cotton cotton;
	public Muslin muslin;
	public Wool wool;
	
	public DesignerSuit(String productName,int productPrice,char productRating,Cotton cotton,Muslin muslin,Wool wool){
		
		this.productName=productName;
		this.productPrice=productPrice;
		this.productRating=productRating;
		this.cotton=cotton;
		this.muslin=muslin;
		this.wool=wool;
		
	}
	public void displayProductDetails(){
		
		System.out.println("The name of finished product is = "+productName);
		System.out.println("The price of finished product is = "+productPrice);
		System.out.println("The rating of finished product is = "+productRating);
		System.out.println("Below are the various raw materials and prices of these materials");
		System.out.println("The raw material used in the product is = "+cotton.materialName);
		System.out.println("The price of raw material used in the product is = "+cotton.materialPrice);
		System.out.println("The raw material used in the product is = "+muslin.materialName);
		System.out.println("The price of raw material used in the product is = "+muslin.materialPrice);
		System.out.println("The raw material used in the product is = "+wool.materialName);
		System.out.println("The price of raw material used in the product is = "+wool.materialPrice);
		
	}
	
}