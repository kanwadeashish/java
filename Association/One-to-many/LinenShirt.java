class LinenShirt{
	
	//I already had a class named "Shirt" so i named this class as "LinenShirt".
	
	public String shirtColour;
	public Fabric fabric;
	
	public LinenShirt(String shirtColour,Fabric fabric){
		
		this.shirtColour=shirtColour;
		this.fabric=fabric;
		
	}
	public void displayShirtDeatils(){
		
		System.out.println("The color of the shirt is = "+shirtColour);
		System.out.println("The brand of the shirt is = "+fabric.fabricBrand);
		System.out.println("The price of the shirt is = "+fabric.price);
		System.out.println("The length of the fabric used in the shirt is(in meter) = "+fabric.fabricLength);
		
	}
	
}