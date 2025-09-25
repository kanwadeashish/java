class EarthPlanet extends Planet{
	
	public int planetNumber;
	public String planetName;
	public long planetCode;
	public double waterPercentage;
	public float landPercentage;
	public char livingRating;
	public boolean isLivible;
	
	public EarthPlanet(){
		
		super();
		System.out.println("This is no argumental constructor in EarthPlanet class.");
		
	}
	public EarthPlanet(int planetNumber,String planetName,long planetCode,double waterPercentage,float landPercentage,char livingRating,boolean isLivible){
		
		this();
		
		super.planetNumber=planetNumber;
		super.planetName=planetName;
		super.planetCode=planetCode;
		super.waterPercentage=waterPercentage;
		super.landPercentage=landPercentage;
		super.livingRating=livingRating;
		super.isLivible=isLivible;
		
		this.planetNumber=planetNumber;
		this.planetName=planetName;
		this.planetCode=planetCode;
		this.waterPercentage=waterPercentage;
		this.landPercentage=landPercentage;
		this.livingRating=livingRating;
		this.isLivible=isLivible;
		
	}
	
	public void displayInfo(){
		
		System.out.println("Planet class planet Number = "+super.planetNumber);
		System.out.println("Planet class planet Name = "+super.planetName);
		System.out.println("Planet class planet Code = "+super.planetCode);
		System.out.println("Planet class water Percentage = "+super.waterPercentage);
		System.out.println("Planet class land Percentage = "+super.landPercentage);
		System.out.println("Planet class living Rating = "+super.livingRating);
		System.out.println("Planet class is Livible = "+super.isLivible);
		
		System.out.println("EarthPlanet class planet Number = "+super.planetNumber);
		System.out.println("EarthPlanet class planet Name = "+super.planetName);
		System.out.println("EarthPlanet class planet Code = "+super.planetCode);
		System.out.println("EarthPlanet class water Percentage = "+super.waterPercentage);
		System.out.println("EarthPlanet class land Percentage = "+super.landPercentage);
		System.out.println("EarthPlanet class living Rating = "+super.livingRating);
		System.out.println("EarthPlanet class is Livible = "+super.isLivible);
		
	}
	
}