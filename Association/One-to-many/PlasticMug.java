class PlasticMug{
	
	//I already had a class named "Mug" so i named this class as "PlasticMug".
	
	public String brandName;
	public int mugPrice;
	public Plastic plastic;
	
	public PlasticMug(String brandName,int mugPrice,Plastic plastic){
		
		this.brandName=brandName;
		this.mugPrice=mugPrice;
		this.plastic=plastic;
		
	}
	public void displayMugDetails(){
		
		System.out.println("The name of brand of the mug is = "+brandName);
		System.out.println("The price of the mug is = "+mugPrice);
		System.out.println("The material used in the mug is = "+plastic.materialName);
		System.out.println("The price of the material used in the mug is(per kg) = "+plastic.pricePerKG);
		
	}
	
}