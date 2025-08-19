class CricketRunner{
	
	public static void main(String[]args){
		
		int numberOfPlayers=Cricket.numberOfPlayers();
		System.out.println("numberOfPlayers="+numberOfPlayers);
		
		int overs=Cricket.overs();
		System.out.println("overs="+overs);
		
		int runs=Cricket.runs();
		System.out.println("runs="+runs);
		
		int target=Cricket.target();
		System.out.println("target="+target);
		
		int jerseyNumber=Cricket.jerseyNumber();
		System.out.println("jerseyNumber="+jerseyNumber);
		
	}
	
}