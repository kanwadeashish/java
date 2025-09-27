class DesignerSuitRunner{
	
	public static void main(String [] args){
		
		Cotton cotton = new Cotton("Cotton",1000);
		Muslin muslin = new Muslin("Muslin",1500);
		Wool wool = new Wool("Wool",2000);
		
		DesignerSuit suit = new DesignerSuit("Classic Suit",20000,'a',cotton,muslin,wool);
		
		suit.displayProductDetails();
		
	}
	
}