class SolarSystem{
	
	public static String planets(String planetPosition,int planetNumber){
		
		String planetName="";

		if(planetPosition=="centre" && planetNumber==0){
			planetName="sun";
			System.out.println("Centre Position :"+planetName);
		}else if(planetPosition=="first" && planetNumber==1){
			planetName="Mercury";
			System.out.println("First Position :"+planetName);
		}else if(planetPosition=="second" && planetNumber==2){
			planetName="Venus";
			System.out.println("Second Position :"+planetName);
		}else if(planetPosition=="third" && planetNumber==3){
			planetName="Earth";
			System.out.println("Third Position :"+planetName);
		}else if(planetPosition=="fourth" && planetNumber==4){
			planetName="Mars";
			System.out.println("Fourth Position :"+planetName);
		}else if(planetPosition=="fifth" && planetNumber==5){
			planetName="Jupiter";
			System.out.println("Fifth Position :"+planetName);
		}else if(planetPosition=="sixth" && planetNumber==6){
			planetName="Saturn";
			System.out.println("Sixth Position :"+planetName);
		}else if(planetPosition=="seventh" && planetNumber==7){
			planetName="Uranus";
			System.out.println("Seventh Position :"+planetName);
		}else if(planetPosition=="eighth" && planetNumber==8){
			planetName="Neptune";
			System.out.println("Eighth Position :"+planetName);
		}else if(planetPosition=="ninth" && planetNumber==9){
			planetName="Pluto";
			System.out.println("Ninth Position :"+planetName);
		}else {
			System.out.println("The position you entered is not in solar syatem.");
		}
		return planetName;
	}
	
}