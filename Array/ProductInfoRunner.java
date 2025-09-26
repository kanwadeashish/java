class ProductInfoRunner{
	
	public static void main(String[]args){
		
		ProductInfo info = new ProductInfo();
		
		Product one = new Product("Mobile",15000,123456789L,'a');
		Product two = new Product("Phone",20000,567856789L,'a');
		Product three = new Product("Mixer",3000,678916789L,'a');
		
		Product[] productInfo = {one,two,three};
		
		info.takingInputArray(productInfo);
		
	}

}