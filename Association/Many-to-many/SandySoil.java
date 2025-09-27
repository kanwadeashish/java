class SandySoil{
	
	public String soilType;
	public OatSeeds oat;
	public SoySeeds soy;
	public CornSeeds corn;
	
	public SandySoil(String soilType,OatSeeds oat,SoySeeds soy,CornSeeds corn){
		
		this.soilType=soilType;
		this.oat=oat;
		this.soy=soy;
		this.corn=corn;
		
	}
	public void cropDetails(){
		
		System.out.println("The soil where crops are growing is = "+soilType);
		System.out.println("The price of seeds is(per kg) = "+oat.pricePerKG);
		System.out.println("The name of seeds is = "+oat.seedName);
		System.out.println("The price of seeds is(per kg) = "+soy.pricePerKG);
		System.out.println("The name of seeds is = "+soy.seedName);
		System.out.println("The price of seeds is(per kg) = "+corn.pricePerKG);
		System.out.println("The name of seeds is = "+corn.seedName);
		
	}
	
}