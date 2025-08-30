class TuesdayRunner{
	
	public static void main(String [] args){
		
		Tuesday nonArg = new Tuesday();
		
		Tuesday singleArg = new Tuesday("Tuesday");
		
		Tuesday doubleArg = new Tuesday("Tuesday",2);
		
		Tuesday tripleArg = new Tuesday("Tuesday",2,123456789L);
		
		Tuesday quadraArg = new Tuesday("Tuesday",2,123456789L,27.30);
		
		Tuesday pentaArg = new Tuesday("Tuesday",2,123456789L,27.30,91.9f);
		
		Tuesday hexaArg = new Tuesday("Tuesday",2,123456789L,27.30,91.9f,'a');
		
		Tuesday heptaArg = new Tuesday("Tuesday",2,123456789L,27.30,91.9f,'a',true);
		
	}
	
}