class OreoShakeRunner{
	
	public static void main(String[]args){
		
		Oreo oreo = new Oreo("Oreo");
		IceCube cube = new IceCube("IceCube");
		Milk milk = new Milk("Milk");
		
		OreoShake shake = new OreoShake("Oreo Shake",50,oreo,cube,milk);
		
		shake.displayOreoShakeDetails();
		
	}
	
}