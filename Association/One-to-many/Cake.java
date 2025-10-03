class Cake{
	
	public int cakePrice;
	public String cakeFlavour;
	public Cream cream;
	
	public Cake(int cakePrice,String cakeFlavour,Cream cream){
		
		this.cakePrice=cakePrice;
		this.cakeFlavour=cakeFlavour;
		this.cream=cream;
		
	}
	public void displayCakeDetails(){
		
		System.out.println("The brand of the cream is = "+cream.creamBrand);
		System.out.println("The price of the cake is = "+cakePrice);
		System.out.println("The flavour of the cake is = "+cakeFlavour);
		
	}
	
}