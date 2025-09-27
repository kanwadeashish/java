class FabricRunner{
	
	public static void main(String[]args){
		
		Fabric fabricForShirt = new Fabric("Linen",500,2.1);
		Fabric fabricForPant = new Fabric("Linen",700,3.1);
		
		LinenShirt shirt = new LinenShirt("White",fabricForShirt);
		LinenPant pant = new LinenPant("Black",fabricForPant);
		
		shirt.displayShirtDeatils();
		pant.displayPantDeatils();
	}
	
}