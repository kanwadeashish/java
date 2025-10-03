class SandWich{
	
	public int dishPrice;
	public String dishName;
	public Paneer paneer;
	public Bread bread;
	
	public SandWich(int dishPrice,String dishName,Paneer paneer,Bread bread){
		
		this.dishPrice=dishPrice;
		this.dishName=dishName;
		this.paneer=paneer;
		this.bread=bread;
		
	}
	public void sandWichDetails(){
		
		System.out.println("The price of the dish is = "+dishPrice);
		System.out.println("The name of the dish is = "+dishName);
		System.out.println("The price of the ingredient paneer used in the dish is = "+paneer.paneerPrice);
		System.out.println("The brand of the ingredient paneer used in the dish is = "+paneer.paneerBrand);
		System.out.println("The price of the ingredient bread used in the dish is = "+bread.breadPrice);
		System.out.println("The brand of the ingredient bread used in the dish is = "+bread.breadBrand);
		
	}
	
}