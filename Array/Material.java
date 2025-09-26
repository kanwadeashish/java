class Material{
	
	public String materialtName;
	public int price;
	public long serialNumber;
	public char materialRating;
	
	public Material(String materialtName,int price,long serialNumber,char materialRating){
		
		this.materialtName=materialtName;
		this.price=price;
		this.serialNumber=serialNumber;
		this.materialRating=materialRating;
		
	}
	
	public void displayMaterialInfo(){
		
		System.out.println("The name of the Material is = "+materialtName);
		System.out.println("The price of the Material is = "+price);
		System.out.println("The serial Number of the Material is = "+serialNumber);
		System.out.println("The rating of the Material is = "+materialRating);
		
	}
	
}