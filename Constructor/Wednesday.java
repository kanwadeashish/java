class Wednesday{
	
	public Wednesday(){
		System.out.println("This is non-argumental constructor.");
	}
	
	public Wednesday(String day){
		System.out.println("Day ="+day);
	}
	
	public Wednesday(String day,int dayNumber){
		System.out.println("Day Number ="+dayNumber);
	}
	
	public Wednesday(String day,int dayNumber,long dayRepeated){
		System.out.println("How many times day is repeated sing 2023 ="+dayRepeated);
	}
	
	public Wednesday(String day,int dayNumber,long dayRepeated,double dayTemp){
		System.out.println("Tempeature during day ="+dayTemp);
	}
	
	public Wednesday(String day,int dayNumber,long dayRepeated,double dayTemp,float dayFrequency){
		System.out.println("Frequency of radio during day ="+dayFrequency);
	}
	
	public Wednesday(String day,int dayNumber,long dayRepeated,double dayTemp,float dayFrequency,char dayRating){
		System.out.println("rating of day based on pollution ="+dayRating);
	}
	
	public Wednesday(String day,int dayNumber,long dayRepeated,double dayTemp,float dayFrequency,char dayRating,boolean dayIsSunny){
		System.out.println("Is the day sunny ="+dayIsSunny);
	}
	
}