class WhiteInfo{
	
	public String infoOf;
	public Black black;
	public White white;
	
	public WhiteInfo(String infoOf,Black black,White white){
		
		this.infoOf=infoOf;
		this.black=black;
		this.white=white;
		
	}
	
	public void detailsOfWhiteInfo(){
		
		System.out.println("This is About white info.");
		System.out.println("This is info of = "+infoOf);
		System.out.println("White info rejects = "+black.blackDetails);
		System.out.println("White info Accepts = "+white.whiteDetails);
		
	}
	
}