class PlasticBucket{
	
	//I already had a class named "Bucket" so i named this class as "PlasticBucket".
	
	public String brandName;
	public int bucketPrice;
	public Plastic plastic;
	
	public PlasticBucket(String brandName,int bucketPrice,Plastic plastic){
		
		this.brandName=brandName;
		this.bucketPrice=bucketPrice;
		this.plastic=plastic;
		
	}
	public void displayBucketDetails(){
		
		System.out.println("The name of brand of the bucket is = "+brandName);
		System.out.println("The price of the bucket is = "+bucketPrice);
		System.out.println("The material used in the bucket is = "+plastic.materialName);
		System.out.println("The price of the material used in the bucket is(per kg) = "+plastic.pricePerKG);
		
	}
	
}