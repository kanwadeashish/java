class FurnishingRunner{
	
	public static void main(String[]args){
		
		Silk silk = new Silk("Silk",333);
		Satin satin = new Satin("Satin",666);
		Polyester polyester = new Polyester("Polyester",999);
		
		Furnishing furnishing = new Furnishing("Furnishing",10000,'a',silk,satin,polyester);
		
		furnishing.displayProductDetails();
		
	}
	
}