class CreamRunner{
	
	public static void main(String[]args){
		
		Cake cake = new Cake(300,"Chocolate");
		
		Biscuit biscuit = new Biscuit(30,"Vanilla");
		
		Cream cream = new Cream("Amul",cake,biscuit);
		cream.displayDetails();
		
	}
	
}