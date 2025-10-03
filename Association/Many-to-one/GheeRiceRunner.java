class GheeRiceRunner{
	
	public static void main(String [] args){
		
		Rice rice = new Rice(50,"Dawat");
		
		Ghee ghee = new Ghee(100,"Amul");
		
		GheeRice gheeRice = new GheeRice(150,"Ghee Rice",rice,ghee);
		gheeRice.gheeRiceDetails();
		
	}
	
}