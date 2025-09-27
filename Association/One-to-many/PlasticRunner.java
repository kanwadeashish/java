class PlasticRunner{
	
	public static void main(String[]args){
		
		Plastic plastic = new Plastic("Plastic",100);
		
		PlasticBucket bucket = new PlasticBucket("Supreme",500,plastic);
		PlasticMug mug = new PlasticMug("Nirvana",200,plastic);
		
		bucket.displayBucketDetails();
		mug.displayMugDetails();
		
	}
	
}