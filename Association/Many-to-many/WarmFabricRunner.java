class WarmFabricRunner{
	
	public static void main(String[]args){
		
		Canvas canvas = new Canvas(100,"Canvas");
		
		Cashmere cashmere = new Cashmere(150,"Cashmere");
		
		Chenille chenille = new Chenille(200,"Chenille");
		
		Coat coat = new Coat("Coat",700,canvas,cashmere,chenille);
		coat.coatDetails();
		
		Sweater sweater = new Sweater("Sweater",800,canvas,cashmere,chenille);
		sweater.sweaterDetails();
		
		SweatShirt sweatShirt = new SweatShirt("SweatShirt",900,canvas,cashmere,chenille);
		sweatShirt.sweatShirtDetails();
		
	}
	
}