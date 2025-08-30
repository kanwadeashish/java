class MondayRunner{
	
	public static void main(String [] args){
		
		Monday nonArg = new Monday();
		
		Monday singleArg = new Monday("Monday");
		
		Monday doubleArg = new Monday("Monday",1);
		
		Monday tripleArg = new Monday("Monday",1,123456789L);
		
		Monday quadraArg = new Monday("Monday",1,123456789L,27.30);
		
		Monday pentaArg = new Monday("Monday",1,123456789L,27.30,91.9f);
		
		Monday hexaArg = new Monday("Monday",1,123456789L,27.30,91.9f,'a');
		
		Monday heptaArg = new Monday("Monday",1,123456789L,27.30,91.9f,'a',true);
		
	}
	
}