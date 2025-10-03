class Cream{
	
	public String creamBrand;
	public Cake cake;
	public Biscuit biscuit;
	
	public Cream(String creamBrand,Cake cake,Biscuit biscuit){
		
		this.creamBrand=creamBrand;
		this.cake=cake;
		this.biscuit=biscuit;
		
	}
	public void displayDetails(){
		
		System.out.println("The brand of the cream is = "+creamBrand);
		System.out.println("The price of the cake is = "+cake.cakePrice);
		System.out.println("The flavour of the cake is = "+cake.cakeFlavour);
		System.out.println("The price of the biscuit is = "+biscuit.biscuitPrice);
		System.out.println("The flavour of the biscuit is = "+biscuit.biscuitFlavour);
		
	}
	
}