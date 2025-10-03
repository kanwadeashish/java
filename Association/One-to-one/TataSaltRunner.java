class TataSaltRunner{
	
	public static void main(String [] args){
		
		SaltPacket packet = new SaltPacket(25);
		
		TataSalt salt = new TataSalt("1 KG",packet);
		
		salt.displayDetails();
		
	}
	
}