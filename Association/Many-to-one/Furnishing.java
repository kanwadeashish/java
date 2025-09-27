class Furnishing{
	
	public String finalProduct;
	public int productPrice;
	public char productRating;
	public Silk silk;
	public Satin satin;
	public Polyester polyester;
	
	public Furnishing(String finalProduct,int productPrice,char productRating,Silk silk,Satin satin,Polyester polyester){
		
		this.finalProduct=finalProduct;
		this.productPrice=productPrice;
		this.productRating=productRating;
		this.silk=silk;
		this.satin=satin;
		this.polyester=polyester;
		
	}
	public void displayProductDetails(){
		
		System.out.println("The name of finished product is = "+finalProduct);
		System.out.println("The price of finished product is = "+productPrice);
		System.out.println("The rating of finished product is = "+productRating);
		System.out.println("Below are the various raw materials and prices of these materials");
		System.out.println("The raw material used in the product is = "+silk.materialName);
		System.out.println("The price of raw material used in the product is = "+silk.materialPrice);
		System.out.println("The raw material used in the product is = "+satin.materialName);
		System.out.println("The price of raw material used in the product is = "+satin.materialPrice);
		System.out.println("The raw material used in the product is = "+polyester.materialName);
		System.out.println("The price of raw material used in the product is = "+polyester.materialPrice);
		
	}
	
}