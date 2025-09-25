class India extends CountryIndia{
	
	public int countryNumber;
	public String countryName;
	public long countrySerialNumber;
	public double literacyIn2024;
	public float literacyIn2011;
	public char rating;
	public boolean isSafe;
	
	public India(){
		
		super();
		System.out.println("This is no argumental constructor in India class.");
		
	}
	public India(int countryNumber,String countryName,long countrySerialNumber,double literacyIn2024,float literacyIn2011,char rating,boolean isSafe){
		
		this();
		
		super.countryNumber=countryNumber;
		super.countryName=countryName;
		super.countrySerialNumber=countrySerialNumber;
		super.literacyIn2024=literacyIn2024;
		super.literacyIn2011=literacyIn2011;
		super.rating=rating;
		super.isSafe=isSafe;
		
		this.countryNumber=countryNumber;
		this.countryName=countryName;
		this.countrySerialNumber=countrySerialNumber;
		this.literacyIn2024=literacyIn2024;
		this.literacyIn2011=literacyIn2011;
		this.rating=rating;
		this.isSafe=isSafe;
		
	}
	
	public void displayInfo(){
		
		System.out.println("CountryIndia class country Number = "+super.countryNumber);
		System.out.println("CountryIndia class country Name = "+super.countryName);
		System.out.println("CountryIndia class country Serial Number = "+super.countrySerialNumber);
		System.out.println("CountryIndia class literacy In 2024 = "+super.literacyIn2024);
		System.out.println("CountryIndia class literacy In 2011 = "+super.literacyIn2011);
		System.out.println("CountryIndia class rating = "+super.rating);
		System.out.println("CountryIndia class is Safe = "+super.isSafe);
		
		System.out.println("India class country Number = "+this.countryNumber);
		System.out.println("India class country Name = "+this.countryName);
		System.out.println("India class country Serial Number = "+this.countrySerialNumber);
		System.out.println("India class literacy In 2024 = "+this.literacyIn2024);
		System.out.println("India class literacy In 2011 = "+this.literacyIn2011);
		System.out.println("India class rating = "+this.rating);
		System.out.println("India class is Safe = "+this.isSafe);
		
	}
	
}