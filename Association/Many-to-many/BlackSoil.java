class BlackSoil{
	
	public String soilType;
	public CocoaSeeds cocoa;
	public SesameSeeds sesame;
	public PumpkinSeeds pumpkin;
	
	public BlackSoil(String soilType,CocoaSeeds cocoa,SesameSeeds sesame,PumpkinSeeds pumpkin){
		
		this.soilType=soilType;
		this.cocoa=cocoa;
		this.sesame=sesame;
		this.pumpkin=pumpkin;
		
	}
	public void cropDetails(){
		
		System.out.println("The soil where crops are growing is = "+soilType);
		System.out.println("The price of seeds is(per kg) = "+cocoa.pricePerKG);
		System.out.println("The name of seeds is = "+cocoa.seedName);
		System.out.println("The price of seeds is(per kg) = "+sesame.pricePerKG);
		System.out.println("The name of seeds is = "+sesame.seedName);
		System.out.println("The price of seeds is(per kg) = "+pumpkin.pricePerKG);
		System.out.println("The name of seeds is = "+pumpkin.seedName);
		
	}
	
}