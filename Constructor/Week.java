class Week{
	
	public Week(){
		System.out.println("This is non argumental constructor.");
	}
	
	public Week(String collectionOfDays){
		System.out.println("Collection of seven days is knows as ="+collectionOfDays);
	}
	
	public Week(String collectionOfDays,int days){
		System.out.println("Number of days in a week ="+days);
	}
	
	public Week(String collectionOfDays,int days,long repeat){
		System.out.println("How many times a week repeats in n number of years ="+repeat);
	}
	
	public Week(String collectionOfDays,int days,long repeat,float frequency){
		System.out.println("The frequency in this week is ="+frequency);
	}
	
	public Week(String collectionOfDays,int days,long repeat,float frequency,double humidity){
		System.out.println("Humidity in this week is ="+humidity);
	}
	
	public Week(String collectionOfDays,int days,long repeat,float frequency,double humidity,char rating){
		System.out.println("This weeks weather rating ="+rating);
	}
	
	public Week(String collectionOfDays,int days,long repeat,float frequency,double humidity,char rating,boolean isEnjoyable){
		System.out.println("Is this week engoyable ="+isEnjoyable);
	}
	
}