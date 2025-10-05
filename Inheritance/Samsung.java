class Samsung extends MobileCompanies{
	
	public Samsung(){
		
		super();
		System.out.println("No argumental constructor in sub or child class.");

	}
	public void companyName(String name){
		
		System.out.println("This is overriding the parent class method in child class.");
		System.out.println("The name of the company is = "+name);
		
	}
	public void mobilePrice(int amount){
		
		System.out.println("This is overriding the parent class method in child class.");
		System.out.println("The price of the mobile is = "+amount);
		
	}
	public void companyName(String name,char companyRating){
		
		System.out.println("This is overloading the same(child) class method in same(child) class.");
		System.out.println("The name of the company is = "+name);
		System.out.println("The rating for the company is = "+companyRating);
		
	}
	public void mobilePrice(int amount,boolean isExpensive){
		
		System.out.println("This is overloading the same(child) class method in same(child) class.");
		System.out.println("The price of the mobile is = "+amount);
		System.out.println("Is the mobile phone expensive ?? = "+isExpensive);
		
		
	}
}