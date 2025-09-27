class SeedsFarmingRunner{
	
	public static void main(String[]args){
		
		CocoaSeeds cocoaBlack = new CocoaSeeds(100,"Cocoa");
		CocoaSeeds cocoaRed = new CocoaSeeds(150,"Cocoa");
		CocoaSeeds cocoaWhite = new CocoaSeeds(200,"Cocoa");
		
		SesameSeeds sesameBlack = new SesameSeeds(250,"Sesame");
		SesameSeeds sesameRed = new SesameSeeds(300,"Sesame");
		SesameSeeds sesameWhite = new SesameSeeds(350,"Sesame");
		
		PumpkinSeeds pumpkinBlack = new PumpkinSeeds(400,"Pumpkin");
		PumpkinSeeds pumpkinRed = new PumpkinSeeds(450,"Pumpkin");
		PumpkinSeeds pumpkinWhite = new PumpkinSeeds(500,"Pumpkin");
		
		BlackSoil black = new BlackSoil("Black",cocoaBlack,sesameBlack,pumpkinBlack);
		RedSoil red = new RedSoil("Red",cocoaRed,sesameRed,pumpkinRed);
		WhiteSoil white = new WhiteSoil("White",cocoaWhite,sesameWhite,pumpkinWhite);
		
		black.cropDetails();
		red.cropDetails();
		white.cropDetails();
		
	}
	
}