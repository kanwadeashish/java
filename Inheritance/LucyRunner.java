class LucyRunner{
	
	public static void main(String[]args){
		
		Lucy lucy = new Lucy();
		Lucy one = new Lucy(2);
		Lucy two = new Lucy(2,"Lucy");
		Lucy three = new Lucy(2,"Lucy",678956789L);
		Lucy four = new Lucy(2,"Lucy",678956789L,35.99);
		Lucy five = new Lucy(2,"Lucy",678956789L,35.99,49.98f);
		Lucy six = new Lucy(2,"Lucy",678956789L,35.99,49.98f,'d');
		Lucy seven = new Lucy(2,"Lucy",678956789L,35.99,49.98f,'d',true);
		
	}
	
}