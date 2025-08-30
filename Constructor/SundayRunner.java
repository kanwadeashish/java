class SundayRunner{
	
	public static void main(String [] args){
		
		Sunday nonArg = new Sunday();
		
		Sunday singleArg = new Sunday("Sunday");
		
		Sunday doubleArg = new Sunday("Sunday",7);
		
		Sunday tripleArg = new Sunday("Sunday",7,123456789L);
		
		Sunday quadraArg = new Sunday("Sunday",7,123456789L,27.30);
		
		Sunday pentaArg = new Sunday("Sunday",7,123456789L,27.30,91.9f);
		
		Sunday hexaArg = new Sunday("Sunday",7,123456789L,27.30,91.9f,'a');
		
		Sunday heptaArg = new Sunday("Sunday",7,123456789L,27.30,91.9f,'a',true);
		
	}
	
}