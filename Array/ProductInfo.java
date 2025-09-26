class ProductInfo{
	
	public void takingInputArray(Product[] product){
		
		for(int num=0;num<product.length;num++){
			
			Product print=product[num];
			print.displayProductInfo();
			
		}
		
	}
	
}