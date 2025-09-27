class Core{
	
	public String coreLocation;
	public Puppet puppet;
	
	public Core(String coreLocation,Puppet puppet){
		
		this.coreLocation=coreLocation;
		this.puppet=puppet;
		
	}
	public void displayDetails(){
		
		System.out.println("The location of the core in the puppet is = "+coreLocation);
		System.out.println("The name of the puppet is = "+puppet.puppetName);
		System.out.println("The version of the puppet is = "+puppet.puppetVersion);
		System.out.println("The price of the puppet is = "+puppet.puppetPrice);
		
	}
	
}