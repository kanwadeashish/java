class Trimmer extends ElectronicGadget{
	
	public int price;
	public String brandName;
	public long modelNumber;
	public double profit;
	public float tax;
	public char rating;
	public boolean isGood;
	
	public Trimmer(){
		
		super();
		System.out.println("This is no argumental constructor in Trimmer class.");
		
	}
	public Trimmer(int price,String brandName,long modelNumber,double profit,float tax,char rating,boolean isGood){
		
		this();
		
		super.price=price;
		super.brandName=brandName;
		super.modelNumber=modelNumber;
		super.profit=profit;
		super.tax=tax;
		super.rating=rating;
		super.isGood=isGood;
		
		this.price=price;
		this.brandName=brandName;
		this.modelNumber=modelNumber;
		this.profit=profit;
		this.tax=tax;
		this.rating=rating;
		this.isGood=isGood;
		
	}
	
	public void displayInfo(){
		
		System.out.println("ElectronicGadget class price = "+super.price);
		System.out.println("ElectronicGadget class brandName = "+super.brandName);
		System.out.println("ElectronicGadget class modelNumber = "+super.modelNumber);
		System.out.println("ElectronicGadget class profit = "+super.profit);
		System.out.println("ElectronicGadget class tax = "+super.tax);
		System.out.println("ElectronicGadget class rating = "+super.rating);
		System.out.println("ElectronicGadget class isGood = "+super.isGood);
		
		System.out.println("Trimmer class price = "+this.price);
		System.out.println("Trimmer class brandName = "+this.brandName);
		System.out.println("Trimmer class modelNumber = "+this.modelNumber);
		System.out.println("Trimmer class profit = "+this.profit);
		System.out.println("Trimmer class tax = "+this.tax);
		System.out.println("Trimmer class rating = "+this.rating);
		System.out.println("Trimmer class isGood = "+this.isGood);
		
	}
	
}