class FridayRunner{
	
	public static void main(String [] args){
		
		Friday nonArg = new Friday();
		
		Friday singleArg = new Friday("Friday");
		
		Friday doubleArg = new Friday("Friday",5);
		
		Friday tripleArg = new Friday("Friday",5,123456789L);
		
		Friday quadraArg = new Friday("Friday",5,123456789L,27.30);
		
		Friday pentaArg = new Friday("Friday",5,123456789L,27.30,91.9f);
		
		Friday hexaArg = new Friday("Friday",5,123456789L,27.30,91.9f,'a');
		
		Friday heptaArg = new Friday("Friday",5,123456789L,27.30,91.9f,'a',true);
		
	}
	
}