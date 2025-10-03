class DifferentFabricRunner{
	
	public static void main(String[]args){
		
		Chiffon chiffon = new Chiffon(75,"Chiffon");
		
		Crepe crepe = new Crepe(125,"Crepe");
		
		Damask damask = new Damask(175,"Damask");
		
		Vest vest = new Vest("Vest",500,chiffon,crepe,damask);
		vest.vestDetails();
		
		Cardigan cardigan = new Cardigan("Cardigan",600,chiffon,crepe,damask);
		cardigan.cardiganDetails();
		
		Hoodie hoodie = new Hoodie("Hoodie",700,chiffon,crepe,damask);
		hoodie.hoodieDetails();
		
	}
	
}