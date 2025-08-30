class SaturdayRunner{
	
	public static void main(String [] args){
		
		Saturday nonArg = new Saturday();
		
		Saturday singleArg = new Saturday("Saturday");
		
		Saturday doubleArg = new Saturday("Saturday",6);
		
		Saturday tripleArg = new Saturday("Saturday",6,123456789L);
		
		Saturday quadraArg = new Saturday("Saturday",6,123456789L,27.30);
		
		Saturday pentaArg = new Saturday("Saturday",6,123456789L,27.30,91.9f);
		
		Saturday hexaArg = new Saturday("Saturday",6,123456789L,27.30,91.9f,'a');
		
		Saturday heptaArg = new Saturday("Saturday",6,123456789L,27.30,91.9f,'a',true);
		
	}
	
}