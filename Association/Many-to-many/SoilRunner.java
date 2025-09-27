class SoilRunner{
	
	public static void main(String[]args){
		
		OatSeeds oatSandy = new OatSeeds(100,"Oat");
		OatSeeds oatSilt = new OatSeeds(150,"Oat");
		OatSeeds oatClay = new OatSeeds(200,"Oat");
		
		SoySeeds soySandy = new SoySeeds(250,"Soy");
		SoySeeds soySilt = new SoySeeds(300,"Soy");
		SoySeeds soyClay = new SoySeeds(350,"Soy");
		
		CornSeeds cornSandy = new CornSeeds(400,"Corn");
		CornSeeds cornSilt = new CornSeeds(450,"Corn");
		CornSeeds cornClay = new CornSeeds(500,"Corn");
		
		SandySoil sandy = new SandySoil("Sandy",oatSandy,soySandy,cornSandy);
		SiltSoil silt = new SiltSoil("Silt",oatSilt,soySilt,cornSilt);
		ClaySoil clay = new ClaySoil("Clay",oatClay,soyClay,cornClay);
		
		sandy.cropDetails();
		silt.cropDetails();
		clay.cropDetails();
		
	}
	
}