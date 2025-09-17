class Vada{
	
	public int price;
	public Chutney chutney;
	
	public Vada(int price){
		
		this.price=price;
		
	}
	
	public void display(Chutney chutney){
		
		this.chutney=chutney;
		System.out.println("The price of vada is = "+price);
		
	}
	
}