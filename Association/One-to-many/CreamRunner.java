class CreamRunner{
	
	public static void main(String[]args){
		
		Cream cream = new Cream("Amul");
		
		Cake cake = new Cake(300,"Chocolate",cream);
		cake.displayCakeDetails();
		
		Biscuit biscuit = new Biscuit(30,"Vanilla",cream);
		biscuit.displayBiscuitDetails();
		
	}
	
}