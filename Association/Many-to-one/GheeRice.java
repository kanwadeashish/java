class GheeRice{
	
	public int dishPrice;
	public String dishName;
	public Rice rice;
	public Ghee ghee;
	
	public GheeRice(int dishPrice,String dishName,Rice rice,Ghee ghee){
		
		this.dishPrice=dishPrice;
		this.dishName=dishName;
		this.rice=rice;
		this.ghee=ghee;
		
	}
	public void gheeRiceDetails(){
		
		System.out.println("The price of the dish is = "+dishPrice);
		System.out.println("The name of the dish is = "+dishName);
		System.out.println("The price of the ingredient rice used in the dish is = "+rice.ricePrice);
		System.out.println("The brand of the ingredient rice used in the dish is = "+rice.riceBrand);
		System.out.println("The price of the ingredient ghee used in the dish is = "+ghee.gheePrice);
		System.out.println("The brand of the ingredient ghee used in the dish is = "+ghee.gheeBrand);
		
	}
	
}