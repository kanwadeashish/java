class SugarRunner{
	
	public static void main(String [] args){
		
		Tea tea = new Tea(15);
		Sugar sugar = new Sugar("Moderate");
		
		tea.displayInfo(sugar);
		sugar.display();
		
	}
	
}