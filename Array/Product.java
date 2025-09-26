class Product{
	
	public String productName;
	public int price;
	public long serialNumber;
	public char productRating;
	
	public Product(String productName,int price,long serialNumber,char productRating){
		
		this.productName=productName;
		this.price=price;
		this.serialNumber=serialNumber;
		this.productRating=productRating;
		
	}
	
	public void displayProductInfo(){
		
		System.out.println("The name of the product is = "+productName);
		System.out.println("The price of the product is = "+price);
		System.out.println("The serial Number of the product is = "+serialNumber);
		System.out.println("The rating of the product is = "+productRating);
		
	}
	
}