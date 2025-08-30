class Friday{
	
	public Friday(){
		System.out.println("This is non-argumental constructor.");
	}
	
	public Friday(String day){
		System.out.println("Day ="+day);
	}
	
	public Friday(String day,int dayNumber){
		System.out.println("Day Number ="+dayNumber);
	}
	
	public Friday(String day,int dayNumber,long dayRepeated){
		System.out.println("How many times day is repeated sing 2023 ="+dayRepeated);
	}
	
	public Friday(String day,int dayNumber,long dayRepeated,double dayTemp){
		System.out.println("Tempeature during day ="+dayTemp);
	}
	
	public Friday(String day,int dayNumber,long dayRepeated,double dayTemp,float dayFrequency){
		System.out.println("Frequency of radio during day ="+dayFrequency);
	}
	
	public Friday(String day,int dayNumber,long dayRepeated,double dayTemp,float dayFrequency,char dayRating){
		System.out.println("rating of day based on pollution ="+dayRating);
	}
	
	public Friday(String day,int dayNumber,long dayRepeated,double dayTemp,float dayFrequency,char dayRating,boolean dayIsSunny){
		System.out.println("Is the day sunny ="+dayIsSunny);
	}
	
}