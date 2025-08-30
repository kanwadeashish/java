class WednesdayRunner{
	
	public static void main(String [] args){
		
		Wednesday nonArg = new Wednesday();
		
		Wednesday singleArg = new Wednesday("Wednesday");
		
		Wednesday doubleArg = new Wednesday("Wednesday",3);
		
		Wednesday tripleArg = new Wednesday("Wednesday",3,123456789L);
		
		Wednesday quadraArg = new Wednesday("Wednesday",3,123456789L,27.30);
		
		Wednesday pentaArg = new Wednesday("Wednesday",3,123456789L,27.30,91.9f);
		
		Wednesday hexaArg = new Wednesday("Wednesday",3,123456789L,27.30,91.9f,'a');
		
		Wednesday heptaArg = new Wednesday("Wednesday",3,123456789L,27.30,91.9f,'a',true);
		
	}
	
}