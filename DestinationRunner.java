class DestinationRunner{
	
	public static void main(String[]args){
		
		int completedDestinations=32; 
		int num=Destination.numOfDestinations(completedDestinations);
		System.out.println(num);
		
		String previousDestinationName="Hell";
		String name=Destination.nameOfDestination(previousDestinationName);
		System.out.println(name);
		
		long distanceCompleted=15675L;
		long number=Destination.distanceRemaining(distanceCompleted);
		System.out.println(number);
		
		float estematedAverage=3.0F;
		float profit=Destination.distanceCompletedPerDay(estematedAverage);
		System.out.println(profit);
		
		double capacity=50.01;
		double value=Destination.kmPerLitre(capacity);
		System.out.println(value);
		
		boolean isDestinationFar=true;
		boolean information=Destination.isDestinationNear(isDestinationFar);
		System.out.println(information);
		
		char comfortRating='A';
		char rating=Destination.journeyRating(comfortRating);
		System.out.println(rating);
		
	}
	
}