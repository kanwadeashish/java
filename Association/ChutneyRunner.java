class ChutneyRunner{
	
	public static void main(String [] args){
		
		Vada vada = new Vada(35);
		Chutney chutney = new Chutney("Excellent");
		
		vada.display(chutney);
		chutney.displayQuality();
		
	}
	
}