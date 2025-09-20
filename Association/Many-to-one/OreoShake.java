class OreoShake{
	
	public String shakeName;
	public int shakePrice;
	public Oreo oreo;
	public IceCube cube;
	public Milk milk;
	
	public OreoShake(String shakeName,int shakePrice,Oreo oreo,IceCube cube,Milk milk){
		
		this.shakeName=shakeName;
		this.shakePrice=shakePrice;
		this.oreo=oreo;
		this.cube=cube;
		this.milk=milk;
		
	}
	
	public void displayOreoShakeDetails(){
		
		System.out.println("This is OreoShake class.");
		System.out.println("The Name of the shake is = "+shakeName);
		System.out.println("The price of the shake is = "+shakePrice);
		System.out.println("The required cookie for shake is = "+oreo.cookieName);
		System.out.println("The required type of ice for the shake is = "+cube.iceType);
		System.out.println("The required ingredient for the shake is = "+milk.requiredIngredient);
		
	}
	
}