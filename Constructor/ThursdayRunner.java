class ThursdayRunner{
	
	public static void main(String [] args){
		
		Thursday nonArg = new Thursday();
		
		Thursday singleArg = new Thursday("Thursday");
		
		Thursday doubleArg = new Thursday("Thursday",4);
		
		Thursday tripleArg = new Thursday("Thursday",4,123456789L);
		
		Thursday quadraArg = new Thursday("Thursday",4,123456789L,27.30);
		
		Thursday pentaArg = new Thursday("Thursday",4,123456789L,27.30,91.9f);
		
		Thursday hexaArg = new Thursday("Thursday",4,123456789L,27.30,91.9f,'a');
		
		Thursday heptaArg = new Thursday("Thursday",4,123456789L,27.30,91.9f,'a',true);
		
	}
	
}