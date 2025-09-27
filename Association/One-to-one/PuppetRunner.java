class PuppetRunner{
	
	public static void main(String[]args){
		
		Puppet puppet = new Puppet("Jarvis",9.9,99999);
		Core core = new Core("Centre",puppet);
		
		core.displayDetails();
		
	}
	
}