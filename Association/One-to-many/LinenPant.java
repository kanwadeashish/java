class LinenPant{
	
	//I already had a class named "Pant" so i named this class as "LinenPant".
	
	public String pantColour;
	public Fabric fabric;
	
	public LinenPant(String pantColour,Fabric fabric){
		
		this.pantColour=pantColour;
		this.fabric=fabric;
		
	}
	public void displayPantDeatils(){
		
		System.out.println("The color of the pant is = "+pantColour);
		System.out.println("The brand of the pant is = "+fabric.fabricBrand);
		System.out.println("The price of the pant is = "+fabric.price);
		System.out.println("The length of the fabric used in the pant is(in meter) = "+fabric.fabricLength);
		
	}
	
}