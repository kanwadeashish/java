class CommonSugar{
	
	public int numberOfSpoons;
	public boolean isSugarLess;
	
	public CommonSugar(int numberOfSpoons,boolean isSugarLess){
		
		this.numberOfSpoons=numberOfSpoons;
		this.isSugarLess=isSugarLess;
		
	}
	
	public void displayCommonSugar(){
		
		System.out.println("This is CommonSugar class");
		System.out.println("Number of spoons = "+numberOfSpoons);
		System.out.println("Is the sugar Sugarless = "+isSugarLess);
		
	}
	
}