class BlackInfo{
	
	public String infoOf;
	public Black black;
	public White white;
	
	public BlackInfo(String infoOf,Black black,White white){
		
		this.infoOf=infoOf;
		this.black=black;
		this.white=white;
		
	}
	
	public void detailsOfWhiteInfo(){
		
		System.out.println("This is About black info.");
		System.out.println("This is info of = "+infoOf);
		System.out.println("Black info Accepts = "+black.blackDetails);
		System.out.println("Black info Rejects = "+white.whiteDetails);
		
	}
	
}