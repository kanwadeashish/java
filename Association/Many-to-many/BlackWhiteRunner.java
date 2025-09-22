class BlackWhiteRunner{
	
	public static void main(String[]args){
		
		Black black = new Black("Black");
		White white = new White("White");
		
		WhiteInfo whiteInfo = new WhiteInfo("Information of White",black,white);
		BlackInfo blackInfo = new BlackInfo("Information of Black",black,white);
		
		whiteInfo.detailsOfWhiteInfo();
		blackInfo.detailsOfWhiteInfo();
		
	}
	
}