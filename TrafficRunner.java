class TrafficRunner{
	
	public static void main(String[]args){
		
		int trafficInterval=120; 
		int seconds=Traffic.trafficLights(trafficInterval);
		System.out.println(seconds);
		
		String trafficGoColour="Green";
		String colour=Traffic.traffcStopColour(trafficGoColour);
		System.out.println(colour);
		
		long inWholeCountry=15675L;
		long number=Traffic.numberOfSignals(inWholeCountry);
		System.out.println(number);
		
		float walkingInterval=60.0F;
		float interval=Traffic.trafficLightInterval(walkingInterval);
		System.out.println(interval);
		
		double greenLightInterval=60.0;
		double timeInterval=Traffic.redLightInterval(greenLightInterval);
		System.out.println(timeInterval);
		
		boolean isSignalGreen=true;
		boolean information=Traffic.isTrafficLightOkay(isSignalGreen);
		System.out.println(information);
		
		char footpathGrade='A';
		char rating=Traffic.signalGrade(footpathGrade);
		System.out.println(rating);
		
	}
	
}