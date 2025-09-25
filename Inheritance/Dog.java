class Dog extends Animal{
	
	public int price;
	public String breed;
	public long idNumber;
	public double musclePercentage;
	public float fatPercentage;
	public char rating;
	public boolean isFriendly;
	
	public Dog(){
		
		super();
		System.out.println("This is no argumental constructor in Dog class.");
		
	}
	public Dog(int price,String breed,long idNumber,double musclePercentage,float fatPercentage,char rating,boolean isFriendly){
		
		this();
		
		super.price=price;
		super.breed=breed;
		super.idNumber=idNumber;
		super.musclePercentage=musclePercentage;
		super.fatPercentage=fatPercentage;
		super.rating=rating;
		super.isFriendly=isFriendly;
		
		this.price=price;
		this.breed=breed;
		this.idNumber=idNumber;
		this.musclePercentage=musclePercentage;
		this.fatPercentage=fatPercentage;
		this.rating=rating;
		this.isFriendly=isFriendly;
		
	}
	
	public void displayInfo(){
		
		System.out.println("Animal class price = "+super.price);
		System.out.println("Animal class breed = "+super.breed);
		System.out.println("Animal class idNumber = "+super.idNumber);
		System.out.println("Animal class musclePercentage = "+super.musclePercentage);
		System.out.println("Animal class fatPercentage = "+super.fatPercentage);
		System.out.println("Animal class rating = "+super.rating);
		System.out.println("Animal class isFriendly = "+super.isFriendly);
		
		System.out.println("Dog class price = "+this.price);
		System.out.println("Dog class breed = "+this.breed);
		System.out.println("Dog class idNumber = "+this.idNumber);
		System.out.println("Dog class musclePercentage = "+this.musclePercentage);
		System.out.println("Dog class fatPercentage = "+this.fatPercentage);
		System.out.println("Dog class rating = "+this.rating);
		System.out.println("Dog class isFriendly = "+this.isFriendly);
		
	}
	
}