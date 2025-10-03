class Biscuit{
	
	public int biscuitPrice;
	public String biscuitFlavour;
	public Cream cream;
	
	public Biscuit(int biscuitPrice,String biscuitFlavour,Cream cream){
		
		this.biscuitPrice=biscuitPrice;
		this.biscuitFlavour=biscuitFlavour;
		this.cream=cream;
		
	}
	public void displayBiscuitDetails(){
		
		System.out.println("The brand of the cream is = "+cream.creamBrand);
		System.out.println("The price of the biscuit is = "+biscuitPrice);
		System.out.println("The flavour of the biscuit is = "+biscuitFlavour);
		
	}
	
}